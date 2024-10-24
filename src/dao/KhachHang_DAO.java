/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connect.ConnectDB;
import entity.KhachHang;
import entity.NhanVien;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.*;
import java.time.LocalDate;

/**
 *
 * @author lemin
 */
public class KhachHang_DAO {

    public Boolean create(KhachHang kh) {
        int n = 0;
        try {
            PreparedStatement ps = ConnectDB.conn.prepareStatement("insert KhachHang values (?,?,?,?) ");
            ps.setString(1, kh.getMaKH());
            ps.setString(2, kh.getTenKhachHang());
            ps.setString(3, kh.getSdt());
            ps.setDouble(4, kh.getDiemTichLuy());
            n = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return n > 0;
    }

    public ArrayList<KhachHang> getAllKhachHang() {
        ArrayList<KhachHang> list = new ArrayList<>();

        try {
            PreparedStatement ps = ConnectDB.conn.prepareStatement("Select * from KhachHang");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String maKhachHang = rs.getString("maKhachHang");
                String tenKhachHang = rs.getString("tenKhachHang");
                String sdt = rs.getString("sdt");
                double diemTichLuy = rs.getDouble("diemTichLuy");
                KhachHang kh = new KhachHang(maKhachHang, tenKhachHang, sdt, diemTichLuy);
                list.add(kh);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachHang_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
     public ArrayList<KhachHang> timKiemTheoMa(String maKhachHang) {
        ArrayList<KhachHang> listKH = new ArrayList<>();
        try {
            PreparedStatement ps = ConnectDB.conn.prepareStatement("select * from KhachHang where maKhachHang = ?");
            ps.setString(1, "%" + maKhachHang + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String maKH = rs.getString("maKhachHang");
                String tenKhachHang = rs.getString("tenKhachHang");
                String sdt = rs.getString("sdt");
                double diemTichLuy = rs.getDouble("diemTichLuy");
                KhachHang kh = new KhachHang(maKH, tenKhachHang, sdt, diemTichLuy);
                listKH.add(kh);

            }
        } catch (SQLException ex) {
            Logger.getLogger(NhanVien_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listKH   ;
    }
    
}
