/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author Lenovo
 */
import entity.Thuoc;
import connect.ConnectDB;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.time.LocalDate;

public class Thuoc_DAO {
   




    // Phương thức tạo mới một đối tượng Thuoc
    public Boolean create(Thuoc thuoc) {
        int n = 0;
        
        try {
            PreparedStatement ps = ConnectDB.conn.prepareStatement("INSERT INTO Thuoc VALUES (?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, thuoc.getMaThuoc());
            ps.setString(2, thuoc.getTenThuoc());
            ps.setDouble(3, thuoc.getGia());
            ps.setDate(4, java.sql.Date.valueOf(thuoc.getHsd()));
            ps.setDate(5, java.sql.Date.valueOf(thuoc.getNsx()));
            ps.setDouble(6, thuoc.getThue());
            ps.setInt(7, thuoc.getSoLuongTon());
            ps.setString(8, thuoc.getMota());
            ps.setString(9, thuoc.getLoaiThuoc().getMaLoai()); // Giả sử LoaiThuoc có phương thức getMaLoai()
            ps.setString(10, thuoc.getXuatXu().getMaXuatXu()); // Giả sử XuatXu có phương thức getMaXuatXu()
            ps.setString(11, thuoc.getNcc().getMaNCC()); // Giả sử NhaCungCap có phương thức getMaNhaCungCap()
            n = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return n > 0;
    }

    // Phương thức lấy tất cả các đối tượng Thuoc
    public ArrayList<Thuoc> getAllThuoc() {
    ArrayList<Thuoc> list = new ArrayList<>();
    
    try {
         ConnectDB.connect();
        String sql="SELECT * FROM Thuoc";
        PreparedStatement ps = ConnectDB.conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            String maThuoc = rs.getString("maThuoc");
            String tenThuoc = rs.getString("tenThuoc");
            double gia = rs.getDouble("gia");

            Date hsdDate = rs.getDate("hsd");
            LocalDate hsd = (hsdDate != null) ? hsdDate.toLocalDate() : null;

            Date nsxDate = rs.getDate("nsx");
            LocalDate nsx = (nsxDate != null) ? nsxDate.toLocalDate() : null;

            double thue = rs.getDouble("thue");
            int soLuongTon = rs.getInt("soLuongTon");
            String mota = rs.getString("mota");

            String maLoai = rs.getString("maLoai");
            String maXuatXu = rs.getString("maXuatXu");
            String maDonViTinh = rs.getString("maDonViTinh");
            String maNCC = rs.getString("maNCC");
            String maGiamGia = rs.getString("maGiamGia");
            System.out.println(tenThuoc);
            Thuoc thuoc = new Thuoc(maThuoc, tenThuoc, gia, hsd, nsx, thue, soLuongTon, mota, maLoai, maXuatXu, maDonViTinh, maNCC, maGiamGia);
            System.out.println(thuoc.getTenThuoc());
            list.add(thuoc);
            
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
       
           
    return list;
}



    // Phương thức lấy một đối tượng Thuoc theo mã thuốc
    public Thuoc getThuoc(String maThuoc) {
        try {
            PreparedStatement ps = ConnectDB.conn.prepareStatement("SELECT * FROM Thuoc WHERE maThuoc = ?");
            ps.setString(1, maThuoc);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String tenThuoc = rs.getString("tenThuoc");
                double gia = rs.getDouble("gia");
                Date hsd = rs.getDate("hsd");
                Date nsx = rs.getDate("nsx");
                double thue = rs.getDouble("thue");
                int soLuongTon = rs.getInt("soLuongTon");
                String mota = rs.getString("mota");
                // Xử lý các thuộc tính liên quan như LoaiThuoc, XuatXu, NhaCungCap

                return new Thuoc(maThuoc, tenThuoc, gia, hsd.toLocalDate(), nsx.toLocalDate(), thue, soLuongTon, mota, null, null, null, null, null);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Phương thức cập nhật thông tin một đối tượng Thuoc
    public boolean suaThuoc(String maThuoc, Thuoc newThuoc) {
        int n = 0;
        try {
            PreparedStatement ps = ConnectDB.conn.prepareStatement(
                "UPDATE Thuoc SET tenThuoc = ?, gia = ?, hsd = ?, nsx = ?, thue = ?, soLuongTon = ?, mota = ?, loaiThuoc = ?, xuatXu = ?, nhaCungCap = ? WHERE maThuoc = ?");
            ps.setString(1, newThuoc.getTenThuoc());
            ps.setDouble(2, newThuoc.getGia());
            ps.setDate(3, java.sql.Date.valueOf(newThuoc.getHsd()));
            ps.setDate(4, java.sql.Date.valueOf(newThuoc.getNsx()));
            ps.setDouble(5, newThuoc.getThue());
            ps.setInt(6, newThuoc.getSoLuongTon());
            ps.setString(7, newThuoc.getMota());
            ps.setString(8, newThuoc.getLoaiThuoc().getMaLoai()); // Giả sử LoaiThuoc có phương thức getMaLoai()
            ps.setString(9, newThuoc.getXuatXu().getMaXuatXu()); // Giả sử XuatXu có phương thức getMaXuatXu()
            ps.setString(10, newThuoc.getNcc().getMaNCC()); // Giả sử NhaCungCap có phương thức getMaNhaCungCap()
            ps.setString(11, maThuoc);
            n = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return n > 0;
    }

    // Phương thức lấy số lượng thuốc
    public int getSize() {
        int n = 0;
        try {
            PreparedStatement ps = ConnectDB.conn.prepareStatement("SELECT COUNT(*) AS total FROM Thuoc");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                n = rs.getInt("total");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return n;
    }

    // Phương thức lấy thuốc cuối cùng (có mã thuốc lớn nhất)
    public Thuoc getLastThuoc() {
        try {
            PreparedStatement ps = ConnectDB.conn.prepareStatement("SELECT TOP 1 * FROM Thuoc ORDER BY maThuoc DESC");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String maThuoc = rs.getString("maThuoc");
                String tenThuoc = rs.getString("tenThuoc");
                double gia = rs.getDouble("gia");
                Date hsd = rs.getDate("hsd");
                Date nsx = rs.getDate("nsx");
                double thue = rs.getDouble("thue");
                int soLuongTon = rs.getInt("soLuongTon");
                String mota = rs.getString("mota");

                return new Thuoc(maThuoc, tenThuoc, gia, hsd.toLocalDate(), nsx.toLocalDate(), thue, soLuongTon, mota, null, null, null, null, null);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Phương thức tìm kiếm thuốc theo mã
    public ArrayList<Thuoc> timKiemTheoMa(String maThuoc) {
        ArrayList<Thuoc> list = new ArrayList<>();
        try {
            PreparedStatement ps = ConnectDB.conn.prepareStatement("SELECT * FROM Thuoc WHERE maThuoc LIKE ?");
            ps.setString(1, "%" + maThuoc + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String tenThuoc = rs.getString("tenThuoc");
                double gia = rs.getDouble("gia");
                Date hsd = rs.getDate("hsd");
                Date nsx = rs.getDate("nsx");
                double thue = rs.getDouble("thue");
                int soLuongTon = rs.getInt("soLuongTon");
                String mota = rs.getString("mota");

                Thuoc thuoc = new Thuoc(rs.getString("maThuoc"), tenThuoc, gia, hsd.toLocalDate(), nsx.toLocalDate(), thue, soLuongTon, mota, null, null, null, null, null);
                list.add(thuoc);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    // Phương thức tìm kiếm thuốc theo tên
    public ArrayList<Thuoc> timKiemTheoTen(String ten) {
        ArrayList<Thuoc> list = new ArrayList<>();
        try {
            PreparedStatement ps = ConnectDB.conn.prepareStatement("SELECT * FROM Thuoc WHERE tenThuoc LIKE ?");
            ps.setString(1, "%" + ten + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String maThuoc = rs.getString("maThuoc");
                String tenThuoc=rs.getString("tenThuoc");
                double gia = rs.getDouble("gia");
                Date hsd = rs.getDate("hsd");
                Date nsx = rs.getDate("nsx");
                double thue = rs.getDouble("thue");
                int soLuongTon = rs.getInt("soLuongTon");
                String mota = rs.getString("mota");
                String maLoai=rs.getString("maLoai");
                String maXuatXu=rs.getString("maXuatXu");
                String maDonViTinh=rs.getString("maDonViTinh");
                String maNCC=rs.getString("maNCC");
                String maGiamGia=rs.getString("maGiamGia");
                Thuoc thuoc = new Thuoc(maThuoc,tenThuoc, gia, hsd.toLocalDate(), nsx.toLocalDate(), thue, soLuongTon, mota, maLoai, maXuatXu, maDonViTinh, maNCC, maGiamGia);
                list.add(thuoc);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    public static void main(String[] args) throws SQLException {
        ConnectDB.connect();
       new Thuoc_DAO().getAllThuoc();
       
        
    }
        
}


