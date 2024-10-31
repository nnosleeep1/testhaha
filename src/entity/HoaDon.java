package entity;

import java.time.LocalDate;
import java.util.ArrayList;

public class HoaDon {

    private String maHD;
    private LocalDate ngayLap;
    private double tongTien;
    private Voucher voucher;
    private KhachHang khachHang;
    private NhanVien nhanVien;
    private ArrayList<ChiTietHoaDon> chiTietHoaDon;

    public double tinhThanhTien() {
        double result = 0;
        for (ChiTietHoaDon CTHD : chiTietHoaDon) {
            result += CTHD.thanhTien();
        }
        return result;
    }

    public double tinhTienThua() {
        throw new UnsupportedOperationException();
    }

    public double tinhThue() {
        throw new UnsupportedOperationException();
    }

    public double TinhTongTienTra() {
        this.tongTien = tinhThanhTien() + (this.voucher != null ? 0 : this.voucher.getGiaGiam());
        return this.tongTien;
    }

    public HoaDon(String maHD, LocalDate ngayLap, double tongTien, Voucher voucher, KhachHang khachHang, NhanVien nhanVien) {
        this.maHD = maHD;
        this.ngayLap = ngayLap;
        this.tongTien = tongTien;
        this.voucher = voucher;
        this.khachHang = khachHang;
        this.nhanVien = nhanVien;
    }
    

    public HoaDon(String maHD) {
        this.maHD = maHD;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public LocalDate getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(LocalDate ngayLap) {
        this.ngayLap = ngayLap;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public Voucher getVoucher() {
        return voucher;
    }

    public void setVoucher(Voucher voucher) {
        this.voucher = voucher;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

}
