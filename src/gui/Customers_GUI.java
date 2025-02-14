/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import com.formdev.flatlaf.FlatClientProperties;
import dao.KhachHang_DAO;
import entity.KhachHang;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import raven.toast.Notifications;
import utilities.SVGIcon;

/**
 *
 * @author HÀ NHƯ
 */
public class Customers_GUI extends javax.swing.JPanel {

    /**
     * Creates new form Customers_GUI
     */
    private DefaultTableModel model;
    private ArrayList<KhachHang> listKH;

    public Customers_GUI() {
        initComponents();
        try {
            connect.ConnectDB.connect();
        } catch (SQLException ex) {
            Logger.getLogger(Customers_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        model = new DefaultTableModel(new String[]{"Mã khách hàng", "Tên khách hàng", "Điểm tích lũy", "Tổng tiền tích lũy"}, 0);
        tbl_khachHang.setModel(model);
        listKH = new KhachHang_DAO().getAllKhachHang();
        taiThongTinLenBang(listKH);
        alterTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_soDienThoai = new javax.swing.JLabel();
        jtf_soDienThoai = new javax.swing.JTextField();
        btn_loc = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_khachHang = new javax.swing.JTable();
        pn_info = new javax.swing.JPanel();
        btn_lamMoi = new javax.swing.JButton();
        btn_capNhat = new javax.swing.JButton();
        btn_themMoi = new javax.swing.JButton();
        btn_xuatFile = new javax.swing.JButton();
        pnl_maKhachHang = new javax.swing.JPanel();
        lbl_maKhachHang = new javax.swing.JLabel();
        jtf_maKhachHang = new javax.swing.JTextField();
        pnl_tenKhachHang = new javax.swing.JPanel();
        lbl_tenKhachHang = new javax.swing.JLabel();
        jtf_tenKhachHang = new javax.swing.JTextField();
        pnl_sdt = new javax.swing.JPanel();
        lbl_sdt = new javax.swing.JLabel();
        jtf_sdt = new javax.swing.JTextField();
        pnl_diemTichLuy = new javax.swing.JPanel();
        lbl_diemTichLuy = new javax.swing.JLabel();
        jtf_diemTichLuy = new javax.swing.JTextField();
        pnl_tongThanhToan = new javax.swing.JPanel();
        lbl_tongThanhToan = new javax.swing.JLabel();
        jtf_tongThanhToan = new javax.swing.JTextField();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16))); // NOI18N

        lbl_soDienThoai.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbl_soDienThoai.setText("Số điện thoại:");

        btn_loc.setBackground(new java.awt.Color(102, 153, 255));
        btn_loc.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_loc.setText("Lọc");
        btn_loc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_locActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_soDienThoai)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtf_soDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_loc)
                .addGap(61, 61, 61))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_soDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_soDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_loc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách khách hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16))); // NOI18N

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        tbl_khachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbl_khachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_khachHangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_khachHang);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                .addContainerGap())
        );

        pn_info.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin khách hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16))); // NOI18N

        btn_lamMoi.setFont(btn_lamMoi.getFont().deriveFont((float)14));
        btn_lamMoi.setText("Xóa trắng");
        btn_lamMoi.setIcon(SVGIcon.getSVGIcon("imgs/public/clear.svg"));
        btn_lamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lamMoiActionPerformed(evt);
            }
        });

        btn_capNhat.setFont(btn_capNhat.getFont().deriveFont((float)14));
        btn_capNhat.setText("Cập nhật");
        btn_capNhat.setIcon(SVGIcon.getSVGIcon("imgs/public/update.svg"));
        btn_capNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_capNhatActionPerformed(evt);
            }
        });

        btn_themMoi.setFont(btn_themMoi.getFont().deriveFont((float)14));
        btn_themMoi.setText("Thêm mới");
        btn_themMoi.putClientProperty(FlatClientProperties.STYLE, "background: $Menu.background;"+"foreground: $Menu.foreground");
        btn_themMoi.setIcon(SVGIcon.getPrimarySVGIcon("imgs/public/add.svg"));
        btn_themMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themMoiActionPerformed(evt);
            }
        });

        btn_xuatFile.setFont(btn_xuatFile.getFont().deriveFont((float)14));
        btn_xuatFile.setText("Xuất file");
        btn_xuatFile.setIcon(SVGIcon.getSVGIcon("imgs/public/excel.svg"));
        btn_xuatFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xuatFileActionPerformed(evt);
            }
        });

        pnl_maKhachHang.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 0, 0, 0));
        pnl_maKhachHang.setMaximumSize(new java.awt.Dimension(1000, 40));
        pnl_maKhachHang.setMinimumSize(new java.awt.Dimension(300, 30));
        pnl_maKhachHang.setPreferredSize(new java.awt.Dimension(200, 30));
        pnl_maKhachHang.setLayout(new javax.swing.BoxLayout(pnl_maKhachHang, javax.swing.BoxLayout.LINE_AXIS));

        lbl_maKhachHang.setText("Mã khách hàng:");
        lbl_maKhachHang.setPreferredSize(new java.awt.Dimension(150, 16));
        pnl_maKhachHang.add(lbl_maKhachHang);

        jtf_maKhachHang.setEditable(false);
        jtf_maKhachHang.setFont(jtf_maKhachHang.getFont().deriveFont((float)16));
        jtf_maKhachHang.setToolTipText("");
        jtf_maKhachHang.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 0)));
        jtf_maKhachHang.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtf_maKhachHang.setFocusable(false);
        jtf_maKhachHang.setMaximumSize(new java.awt.Dimension(2147483647, 40));
        jtf_maKhachHang.setMinimumSize(new java.awt.Dimension(64, 30));
        jtf_maKhachHang.setPreferredSize(new java.awt.Dimension(100, 30));
        jtf_maKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_maKhachHangActionPerformed(evt);
            }
        });
        pnl_maKhachHang.add(jtf_maKhachHang);

        pnl_tenKhachHang.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 0, 0, 0));
        pnl_tenKhachHang.setMaximumSize(new java.awt.Dimension(1000, 40));
        pnl_tenKhachHang.setMinimumSize(new java.awt.Dimension(300, 30));
        pnl_tenKhachHang.setPreferredSize(new java.awt.Dimension(200, 30));
        pnl_tenKhachHang.setLayout(new javax.swing.BoxLayout(pnl_tenKhachHang, javax.swing.BoxLayout.X_AXIS));

        lbl_tenKhachHang.setText("Họ và tên:");
        lbl_tenKhachHang.setPreferredSize(new java.awt.Dimension(150, 16));
        pnl_tenKhachHang.add(lbl_tenKhachHang);

        jtf_tenKhachHang.setFont(jtf_tenKhachHang.getFont().deriveFont((float)16));
        jtf_tenKhachHang.setMaximumSize(new java.awt.Dimension(2147483647, 40));
        jtf_tenKhachHang.setPreferredSize(new java.awt.Dimension(100, 30));
        pnl_tenKhachHang.add(jtf_tenKhachHang);

        pnl_sdt.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 0, 0, 0));
        pnl_sdt.setMaximumSize(new java.awt.Dimension(1000, 40));
        pnl_sdt.setMinimumSize(new java.awt.Dimension(300, 30));
        pnl_sdt.setPreferredSize(new java.awt.Dimension(200, 30));
        pnl_sdt.setLayout(new javax.swing.BoxLayout(pnl_sdt, javax.swing.BoxLayout.LINE_AXIS));

        lbl_sdt.setText("Số điện thoại:");
        lbl_sdt.setPreferredSize(new java.awt.Dimension(150, 16));
        pnl_sdt.add(lbl_sdt);

        jtf_sdt.setFont(jtf_sdt.getFont().deriveFont((float)16));
        jtf_sdt.setMaximumSize(new java.awt.Dimension(2147483647, 40));
        jtf_sdt.setPreferredSize(new java.awt.Dimension(100, 30));
        pnl_sdt.add(jtf_sdt);

        pnl_diemTichLuy.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 0, 0, 0));
        pnl_diemTichLuy.setMaximumSize(new java.awt.Dimension(1000, 40));
        pnl_diemTichLuy.setMinimumSize(new java.awt.Dimension(300, 30));
        pnl_diemTichLuy.setPreferredSize(new java.awt.Dimension(200, 30));
        pnl_diemTichLuy.setLayout(new javax.swing.BoxLayout(pnl_diemTichLuy, javax.swing.BoxLayout.LINE_AXIS));

        lbl_diemTichLuy.setText("Điểm tích lũy:");
        lbl_diemTichLuy.setPreferredSize(new java.awt.Dimension(150, 16));
        pnl_diemTichLuy.add(lbl_diemTichLuy);

        jtf_diemTichLuy.setEditable(false);
        jtf_diemTichLuy.setFont(jtf_diemTichLuy.getFont().deriveFont((float)16));
        jtf_diemTichLuy.setFocusable(false);
        jtf_diemTichLuy.setMaximumSize(new java.awt.Dimension(2147483647, 40));
        jtf_diemTichLuy.setPreferredSize(new java.awt.Dimension(100, 30));
        pnl_diemTichLuy.add(jtf_diemTichLuy);

        pnl_tongThanhToan.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 0, 0, 0));
        pnl_tongThanhToan.setMaximumSize(new java.awt.Dimension(1000, 40));
        pnl_tongThanhToan.setMinimumSize(new java.awt.Dimension(300, 30));
        pnl_tongThanhToan.setPreferredSize(new java.awt.Dimension(200, 30));
        pnl_tongThanhToan.setLayout(new javax.swing.BoxLayout(pnl_tongThanhToan, javax.swing.BoxLayout.LINE_AXIS));

        lbl_tongThanhToan.setText("Tổng thanh toán:");
        lbl_tongThanhToan.setPreferredSize(new java.awt.Dimension(150, 16));
        pnl_tongThanhToan.add(lbl_tongThanhToan);

        jtf_tongThanhToan.setEditable(false);
        jtf_tongThanhToan.setFont(jtf_tongThanhToan.getFont().deriveFont((float)16));
        jtf_tongThanhToan.setFocusable(false);
        jtf_tongThanhToan.setMaximumSize(new java.awt.Dimension(2147483647, 40));
        jtf_tongThanhToan.setPreferredSize(new java.awt.Dimension(100, 30));
        pnl_tongThanhToan.add(jtf_tongThanhToan);

        javax.swing.GroupLayout pn_infoLayout = new javax.swing.GroupLayout(pn_info);
        pn_info.setLayout(pn_infoLayout);
        pn_infoLayout.setHorizontalGroup(
            pn_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_infoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_infoLayout.createSequentialGroup()
                        .addComponent(btn_lamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btn_capNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_infoLayout.createSequentialGroup()
                        .addComponent(btn_themMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_xuatFile, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnl_maKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl_tenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl_diemTichLuy, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl_tongThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 8, Short.MAX_VALUE))
        );
        pn_infoLayout.setVerticalGroup(
            pn_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_infoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_maKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_tenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_diemTichLuy, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_tongThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addGroup(pn_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_capNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_lamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_xuatFile, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_themMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pn_info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pn_info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_locActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_locActionPerformed
        KhachHang kh = timKiemTheoSoDienThoai(jtf_soDienThoai.getText().trim());
        if (kh == null) {
            JOptionPane.showConfirmDialog(null, "Khách hàng chưa phải là thành viên");
            jtf_soDienThoai.setFocusable(true);
        } else {
            ArrayList<KhachHang> list = new ArrayList<>();
            list.add(kh);
            taiThongTinLenBang(list);
            jtf_soDienThoai.setText("");
        }
    }//GEN-LAST:event_btn_locActionPerformed

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        // TODO add your handling code here:int row = tbl_customer.getSelectedRow();
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void jtf_maKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_maKhachHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_maKhachHangActionPerformed

    private void btn_xuatFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xuatFileActionPerformed
        // Hiển thị hộp thoại chọn file
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Chọn đường dẫn và tên file");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        // Hiển thị hộp thoại và kiểm tra nếu người dùng chọn OK
        int userSelection = fileChooser.showSaveDialog(null);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            // Lấy đường dẫn và tên file được chọn
            File fileToSave = fileChooser.getSelectedFile();
            String filePath = fileToSave.getAbsolutePath();

            // Gọi phương thức để tạo file Excel với đường dẫn và tên file đã chọn
            taoFileExcel(listKH, filePath + ".xlsx");
        }
    }//GEN-LAST:event_btn_xuatFileActionPerformed

    private void btn_themMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themMoiActionPerformed
        try {
            // TODO add your handling code here:
            KhachHang kh = new KhachHang(jtf_maKhachHang.getText(), jtf_tenKhachHang.getText(), jtf_sdt.getText(), 0);
            boolean isCompleted = KhachHang_DAO.taoMoi(kh);
            if (!isCompleted) {
                Notifications.getInstance().show(Notifications.Type.ERROR, "Khách hàng đã tồn tại");
                return;
            }
            taiThongTinLenBang(listKH);
            lamMoiForm();
            Notifications.getInstance().show(Notifications.Type.SUCCESS, "Thêm khách hàng thành công!");

        } catch (Exception ex) {
            Notifications.getInstance().show(Notifications.Type.ERROR, ex.getMessage());
        }
    }//GEN-LAST:event_btn_themMoiActionPerformed

    private void btn_capNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_capNhatActionPerformed
        int row = tbl_khachHang.getSelectedRow();
//        if (row != -1)
        try {
            if (row != -1) {
                KhachHang_DAO.capNhat(jtf_maKhachHang.getText(), getGiaTriForm());

            } else {
                Notifications.getInstance().show(Notifications.Type.ERROR, "Chưa chọn khách hàng muốn cập nhật thông tin!");
                return;
            }
            Notifications.getInstance().show(Notifications.Type.SUCCESS, "Cập nhật thông tin khách hàng thành công!");

        } catch (Exception ex) {
            Logger.getLogger(Customers_GUI.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_capNhatActionPerformed

    private void btn_lamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lamMoiActionPerformed
        // TODO add your handling code here:
        lamMoiForm();
        jtf_soDienThoai.setText("");
    }//GEN-LAST:event_btn_lamMoiActionPerformed

    private void tbl_khachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_khachHangMouseClicked
        // TODO add your handling code here:
        int index = tbl_khachHang.getSelectedRow();
        String maKhachHang = tbl_khachHang.getValueAt(index, 0) + "";
        KhachHang kh = KhachHang_DAO.getKhachHang(maKhachHang);
        jtf_maKhachHang.setText(tbl_khachHang.getValueAt(index, 0) + "");
        jtf_tenKhachHang.setText(tbl_khachHang.getValueAt(index, 1) + "");
        jtf_sdt.setText(kh.getSdt());
        jtf_diemTichLuy.setText(tbl_khachHang.getValueAt(index, 2) + "");
        jtf_tongThanhToan.setText(tbl_khachHang.getValueAt(index, 3) + "");
    }//GEN-LAST:event_tbl_khachHangMouseClicked

    public final void alterTable() {
        DefaultTableCellRenderer rightAlign = new DefaultTableCellRenderer();
        rightAlign.setHorizontalAlignment(JLabel.RIGHT);
        //// Align
        tbl_khachHang.getColumnModel().getColumn(2).setCellRenderer(rightAlign);
    }

    public static void taoFileExcel(ArrayList<KhachHang> list, String filePath) {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Dữ liệu khách hàng");

        // Gộp ô cho tiêu đề
        sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, 4));

        // Thêm dòng thông tin đầu tiên
        Row infoRow = sheet.createRow(0);
        Cell infoCell = infoRow.createCell(0);
        infoCell.setCellValue("Danh sách khách hàng");

        // Thiết lập style cho phần tiêu đề
        CellStyle titleStyle = workbook.createCellStyle();
        Font titleFont = workbook.createFont();
        titleFont.setFontHeightInPoints((short) 18);
        titleStyle.setFont(titleFont);
        titleStyle.setAlignment(HorizontalAlignment.CENTER);
        titleStyle.setVerticalAlignment(VerticalAlignment.CENTER);

        infoCell.setCellStyle(titleStyle);

        Row row_date = sheet.createRow(1);
        Cell cell_date = row_date.createCell(0);
        cell_date.setCellValue("Ngày in: " + new Date());

        // Tạo header row
        Row headerRow = sheet.createRow(2);
        String[] columns = {"Mã khách hàng", "Tên", "Số điện thoại", "Điểm tích lũy"};

        for (int i = 0; i < columns.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(columns[i]);
        }

        // Đổ dữ liệu từ ArrayList vào Excel
        int rowNum = 3;
        for (KhachHang khachHang : list) {
            Row row = sheet.createRow(rowNum++);

            row.createCell(0).setCellValue(khachHang.getMaKH());
            row.createCell(1).setCellValue(khachHang.getTenKhachHang());
            row.createCell(2).setCellValue(khachHang.getSdt());
            row.createCell(3).setCellValue(khachHang.getDiemTichLuy());
        }

        // Ghi vào file
        try (FileOutputStream outputStream = new FileOutputStream(filePath)) {
            workbook.write(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                workbook.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void lamMoiForm() {
        jtf_maKhachHang.setText("");
        jtf_tenKhachHang.setText("");
        jtf_sdt.setText("");
        jtf_diemTichLuy.setText("");
        jtf_tongThanhToan.setText("");
    }

    public final void taiThongTinLenBang(ArrayList<KhachHang> list) {
        model.setRowCount(0);
        for (KhachHang khachHang : list) {
            Object[] row = new Object[]{khachHang.getMaKH(), khachHang.getTenKhachHang(), khachHang.getDiemTichLuy()};
            model.addRow(row);
        }
    }

    private KhachHang getGiaTriForm() throws Exception {
        String maKhachHang = jtf_maKhachHang.getText();
        String tenKhachHang = jtf_tenKhachHang.getText();
        String sdt = jtf_sdt.getText().trim();
        Long diemTichLuy = Long.valueOf(jtf_diemTichLuy.getText());
        return new KhachHang(maKhachHang, tenKhachHang, sdt, diemTichLuy);
    }

    public KhachHang timKiemTheoSoDienThoai(String number) {
        listKH = new KhachHang_DAO().getAllKhachHang();
        for (KhachHang kh : listKH) {
            if (kh.getSdt().equals(number)) {
                return kh;
            }
        }
        return null;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_capNhat;
    private javax.swing.JButton btn_lamMoi;
    private javax.swing.JButton btn_loc;
    private javax.swing.JButton btn_themMoi;
    private javax.swing.JButton btn_xuatFile;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtf_diemTichLuy;
    private javax.swing.JTextField jtf_maKhachHang;
    private javax.swing.JTextField jtf_sdt;
    private javax.swing.JTextField jtf_soDienThoai;
    private javax.swing.JTextField jtf_tenKhachHang;
    private javax.swing.JTextField jtf_tongThanhToan;
    private javax.swing.JLabel lbl_diemTichLuy;
    private javax.swing.JLabel lbl_maKhachHang;
    private javax.swing.JLabel lbl_sdt;
    private javax.swing.JLabel lbl_soDienThoai;
    private javax.swing.JLabel lbl_tenKhachHang;
    private javax.swing.JLabel lbl_tongThanhToan;
    private javax.swing.JPanel pn_info;
    private javax.swing.JPanel pnl_diemTichLuy;
    private javax.swing.JPanel pnl_maKhachHang;
    private javax.swing.JPanel pnl_sdt;
    private javax.swing.JPanel pnl_tenKhachHang;
    private javax.swing.JPanel pnl_tongThanhToan;
    private javax.swing.JTable tbl_khachHang;
    // End of variables declaration//GEN-END:variables
}
