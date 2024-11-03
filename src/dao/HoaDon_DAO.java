package dao;

import entity.HoaDon;
import entity.KhachHang;
import entity.NhanVien;
import entity.Voucher;
import connect.ConnectDB;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class HoaDon_DAO {

    // Phương thức tạo mới một đối tượng HoaDon
    public Boolean create(HoaDon hoaDon) {
        int n = 0;

        try {
            PreparedStatement ps = ConnectDB.conn.prepareStatement("INSERT INTO HoaDon VALUES (?,?,?,?,?,?)");
            ps.setString(1, hoaDon.getMaHD());
            ps.setDate(2, java.sql.Date.valueOf(hoaDon.getNgayLap()));
            ps.setDouble(3, hoaDon.getTongTien());
            ps.setString(4, hoaDon.getNhanVien().getMaNhanVien());
            ps.setString(5, hoaDon.getKhachHang().getMaKH());

            ps.setString(6, hoaDon.getVoucher().getMaVoucher());
            n = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return n > 0;
    }

    // Phương thức lấy tất cả các đối tượng HoaDon
    public ArrayList<HoaDon> getAllHoaDon() {
        ArrayList<HoaDon> list = new ArrayList<>();

        try {
            ConnectDB.connect();
            String sql = "SELECT * FROM HoaDon";
            PreparedStatement ps = ConnectDB.conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String maHD = rs.getString("maHD");
                LocalDate ngayLap = rs.getDate("ngayLap").toLocalDate();
                double tongTien = rs.getDouble("tongTien");

                String maVoucher = rs.getString("maVoucher");
                String maKhachHang = rs.getString("maKH");
                String maNhanVien = rs.getString("maNhanVien");

                Voucher voucher = new Voucher_DAO().getVoucher(maVoucher);  // Lấy thông tin Voucher
                KhachHang khachHang = new KhachHang_DAO().getKhachHang(maKhachHang); // Lấy thông tin khách hàng
                NhanVien nhanVien = new NhanVien_DAO().getNhanVien(maNhanVien); // Lấy thông tin nhân viên

                HoaDon hoaDon = new HoaDon(maHD, ngayLap, tongTien, voucher, khachHang, nhanVien);
                list.add(hoaDon);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    // Phương thức lấy một đối tượng HoaDon theo mã hóa đơn
    public HoaDon getHoaDon(String maHD) {
        try {
            PreparedStatement ps = ConnectDB.conn.prepareStatement("SELECT * FROM HoaDon WHERE maHD = ?");
            ps.setString(1, maHD);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                LocalDate ngayLap = rs.getDate("ngayLap").toLocalDate();
                double tongTien = rs.getDouble("tongTien");

                String maVoucher = rs.getString("maVoucher");
                String maKhachHang = rs.getString("maKhachHang");
                String maNhanVien = rs.getString("maNhanVien");

                Voucher voucher = new Voucher_DAO().getVoucher(maVoucher);
                KhachHang khachHang = new KhachHang_DAO().getKhachHang(maKhachHang);
                NhanVien nhanVien = new NhanVien_DAO().getNhanVien(maNhanVien);

                return new HoaDon(maHD, ngayLap, tongTien, voucher, khachHang, nhanVien);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Phương thức cập nhật thông tin một đối tượng HoaDon
    public boolean suaHoaDon(String maHD, HoaDon newHoaDon) {
        int n = 0;
        try {
            PreparedStatement ps = ConnectDB.conn.prepareStatement(
                    "UPDATE HoaDon SET ngayLap = ?, tongTien = ?, maVoucher = ?, maKhachHang = ?, maNhanVien = ? WHERE maHD = ?");
            ps.setDate(1, java.sql.Date.valueOf(newHoaDon.getNgayLap()));
            ps.setDouble(2, newHoaDon.getTongTien());
            ps.setString(3, newHoaDon.getVoucher().getMaVoucher());
            ps.setString(4, newHoaDon.getKhachHang().getMaKH());
            ps.setString(5, newHoaDon.getNhanVien().getMaNhanVien());
            ps.setString(6, maHD);
            n = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return n > 0;
    }

    // Phương thức xóa một đối tượng HoaDon
    public boolean deleteHoaDon(String maHD) {
        int n = 0;
        try {
            PreparedStatement ps = ConnectDB.conn.prepareStatement("DELETE FROM HoaDon WHERE maHD = ?");
            ps.setString(1, maHD);
            n = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return n > 0;
    }

    // Phương thức lấy số lượng hóa đơn
    public int getSize() {
        int n = 0;
        try {
            PreparedStatement ps = ConnectDB.conn.prepareStatement("SELECT COUNT(*) AS total FROM HoaDon");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                n = rs.getInt("total");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return n;
    }
}
