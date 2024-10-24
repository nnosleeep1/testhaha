/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connect.ConnectDB;
import entity.KhachHang;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.*;

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
            ps.setLong(4, kh.getDiemTichLuy());
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
                Long diemTichLuy = rs.getLong("diemTichLuy");
                KhachHang kh = new KhachHang(maKhachHang, tenKhachHang, sdt, diemTichLuy);
                list.add(kh);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachHang_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    public KhachHang getKhachHang(String maKH) {
    KhachHang khachHang = null;
    try {
        PreparedStatement ps = ConnectDB.conn.prepareStatement("SELECT * FROM KhachHang WHERE maKhachHang = ?");
        ps.setString(1, maKH);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            String maKhachHang = rs.getString("maKhachHang");
            String tenKhachHang = rs.getString("tenKhachHang");
            String sdt = rs.getString("sdt");
            Long diemTichLuy = rs.getLong("diemTichLuy");
            khachHang = new KhachHang(maKhachHang, tenKhachHang, sdt, diemTichLuy);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return khachHang;
}

}
