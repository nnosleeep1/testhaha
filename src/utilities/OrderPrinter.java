/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilities;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.LineSeparator;
import entity.ChiTietHoaDon;
import entity.HoaDon;
import java.awt.Desktop;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;
import javax.imageio.ImageIO;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.Sides;

public class OrderPrinter {

    private final HoaDon order;
    public static final String FONT = "resources/fonts/arial-unicode-ms.ttf";
    private static final String FILE_PATH = "lastOrder.pdf";
    public static enum PrintStatus {
        NOT_FOUND_FILE,
        NOT_FOUND_PRINTER,
        COMPLETE
    }

    enum TextAlign {
        LEFT, CENTER, RIGHT;
    }

    public OrderPrinter(HoaDon order) {
        this.order = order;
    }

    private String getVND(double number) {
        return utilities.FormatNumber.toVND(number);
    }

    private void addTableHeader(PdfPTable table, Font font) {
        Stream.of("Tên sản phẩm", "Giá", "Số lượng", "Tổng tiền")
                .forEach(columnTitle -> {
                    PdfPCell header = new PdfPCell();
                    header.setBackgroundColor(BaseColor.WHITE);
                    header.setBorderWidth(1);
                    header.setPhrase(new Phrase(columnTitle, font));
                    header.setPadding(4);
                    table.addCell(header);
                });
    }

    public PrintStatus printFile() {
//        Tìm kiếm máy in và kích hoạt sự kiện in
        DocFlavor flavor = DocFlavor.SERVICE_FORMATTED.PAGEABLE;
        PrintRequestAttributeSet patts = new HashPrintRequestAttributeSet();
        patts.add(Sides.DUPLEX);
        PrintService[] ps = PrintServiceLookup.lookupPrintServices(flavor, patts);
        if (ps.length == 0) {
            throw new IllegalStateException("No Printer found");
        }

        PrintService myService = null;
        for (PrintService printService : ps) {
            if (printService.getName().equals("Your printer name")) {
                myService = printService;
                break;
            }
        }

        if (myService == null) {
            throw new IllegalStateException("Printer not found");
        }

        try (FileInputStream fis = new FileInputStream(FILE_PATH)) {
            Doc pdfDoc = new SimpleDoc(fis, DocFlavor.INPUT_STREAM.AUTOSENSE, null);
            DocPrintJob printJob = myService.createPrintJob();
            printJob.print(pdfDoc, new HashPrintRequestAttributeSet());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(OrderPrinter.class.getName()).log(Level.SEVERE, null, ex);
            return PrintStatus.NOT_FOUND_FILE;
        } catch (IOException ex) {
            Logger.getLogger(OrderPrinter.class.getName()).log(Level.SEVERE, null, ex);
            return PrintStatus.NOT_FOUND_FILE;

        } catch (PrintException ex) {
            Logger.getLogger(OrderPrinter.class.getName()).log(Level.SEVERE, null, ex);
            return PrintStatus.NOT_FOUND_PRINTER;
        }

        return PrintStatus.COMPLETE;
    }

    public static byte[] resizeImage(byte[] imageData, int targetWidth, int targetHeight) throws IOException {
        BufferedImage originalImage = ImageIO.read(new ByteArrayInputStream(imageData));
        int originalWidth = originalImage.getWidth();
        int originalHeight = originalImage.getHeight();

        double widthRatio = (double) targetWidth / originalWidth;
        double heightRatio = (double) targetHeight / originalHeight;

        double ratio = Math.min(widthRatio, heightRatio);

        int scaledWidth = (int) Math.round(originalWidth * ratio);
        int scaledHeight = (int) Math.round(originalHeight * ratio);

        BufferedImage resizedImage = new BufferedImage(scaledWidth, scaledHeight, BufferedImage.SCALE_SMOOTH);
        Graphics2D g2d = resizedImage.createGraphics();
        g2d.drawImage(originalImage, 0, 0, scaledWidth, scaledHeight, null);
        g2d.dispose();

        byte[] resizedImageData;
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            ImageIO.write(resizedImage, "PNG", baos);
            resizedImageData = baos.toByteArray();
        }

        return resizedImageData;
    }

    public void generatePDF() {
        try {
            //Create Document instance.
            double sumOfPrice = 0;
            Document document = new Document();
            document.setMargins(16, 16, 32, 24);

            //Create OutputStream instance.
            OutputStream outputStream
                    = new FileOutputStream(new File(FILE_PATH));

            //Create PDFWriter instance.
            PdfWriter writer = PdfWriter.getInstance(document, outputStream);
            writer.setLanguage("VN");

            //Open the document.
            document.open();
            BaseFont bf = BaseFont.createFont(FONT, BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
//            Header
            Font headingFont = new Font(bf, 20, Font.BOLD);
            Font subHeadingFont = new Font(bf, 18, Font.BOLD);
            Font bold = new Font(bf, 16, Font.BOLD);
            Font italic = new Font(bf, 16, Font.ITALIC);
            Font font = new Font(bf, 16);
            Font fontStrikeThrou = new Font(bf, 16, Font.STRIKETHRU);
            LineSeparator separator = new LineSeparator(font);

            Paragraph sofware = new Paragraph("Pharmahome", headingFont);
            Paragraph desc = new Paragraph("\"Liều thuốc cho trái tim\"", italic);
            Paragraph store = new Paragraph("12 Nguyễn Văn Bảo, Phường 4, Gò Vấp, Hồ Chí Minh", bold);

            sofware.setAlignment(TextAlign.CENTER.ordinal());
            desc.setAlignment(TextAlign.CENTER.ordinal());
            store.setAlignment(TextAlign.CENTER.ordinal());
            document.add(sofware);
            document.add(desc);
            document.add(store);
            document.add(separator);

//            Content
            Paragraph orderTitle = new Paragraph("HÓA ĐƠN THANH TOÁN", subHeadingFont);
            orderTitle.setAlignment(TextAlign.CENTER.ordinal());
            document.add(orderTitle);
            document.add(separator);

//            Order info
            document.add(new Paragraph(String.format("Số hóa đơn:  %s", order.getMaHD()), font));
            document.add(new Paragraph(String.format("Ngày tạo:  %s", order.getNgayLap()), font));
            document.add(new Paragraph(String.format("Nhân viên:  %s", order.getNhanVien().getTenNhanVien()), font));
            document.add(new Paragraph(String.format("Khách hàng:  %s", order.getKhachHang().getTenKhachHang()), font));
            document.add(separator);

//          Order detail  
            PdfPTable table = new PdfPTable(4);
            table.setSpacingBefore(20);
            table.setWidthPercentage(100);
            addTableHeader(table, subHeadingFont);

            int index = 0;
            for (ChiTietHoaDon detail : order.getListCTHD()) {

                table.addCell(new PdfPCell(new Phrase(String.valueOf(detail.getThuoc().getTenThuoc()), font)));

                table.addCell(new PdfPCell(new Phrase(String.valueOf(detail.getDonGia()), font)));
                table.addCell(new PdfPCell(new Phrase(String.valueOf(detail.getSoLuong()), font)));
                table.addCell(new PdfPCell(new Phrase(String.valueOf(detail.thanhTien()), font)));
                sumOfPrice += detail.thanhTien();

            }

            document.add(table);

//            Order footer    
            if (order.getVoucher().getMaVoucher() != null) {
                document.add(new Paragraph("Voucher : " + order.getVoucher().getMaVoucher(), font));
                document.add(new Paragraph("Số tiền đã giảm : " +(getVND(order.getVoucher().getGiaGiam()* sumOfPrice)), font));
            }
            document.add(new Paragraph("Tổng tiền: " + getVND(order.getTongTien()), font));

            document.add(separator);

//            Footer
            document.add(separator);
            Paragraph thongTinLienHe = new Paragraph("Nếu có thắc mắc xin vui lòng liên hệ: 0987231340 (Minh Tiến)", bold);
            Paragraph note = new Paragraph("Quý khách có nhu cầu lấy hóa đơn đề nghị lấy ngay trong ngày", italic);

            Paragraph note2 = new Paragraph("Cảm ơn quý khách đã mua thuốc", font);

            thongTinLienHe.setAlignment(TextAlign.CENTER.ordinal());
            note.setAlignment(TextAlign.CENTER.ordinal());
            note.setIndentationLeft(50);
            note.setIndentationRight(50);
            note2.setAlignment(TextAlign.CENTER.ordinal());

            document.add(thongTinLienHe);
            document.add(note);
            document.add(note2);

            //Close document and outputStream.
            document.close();
            outputStream.close();

            Desktop d = Desktop.getDesktop();
            d.open(new File(FILE_PATH));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
