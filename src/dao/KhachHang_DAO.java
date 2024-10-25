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

    public static ArrayList<KhachHang> getAllKhachHang() {
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

    public static KhachHang getKhachHang(String maKH) {
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

    public static Boolean taoMoi(KhachHang kh) {
        try {
            String phoneCheck = "select * from Customer where phoneNumber = ?";
            PreparedStatement phoneStatement = ConnectDB.conn.prepareStatement(phoneCheck);
            phoneStatement.setString(1, kh.getSdt());
            if (phoneStatement.executeQuery().next()) {
                return false;
            }

            String sql = "INSERT INTO Customer (maKhachHang, tenKhachHang, sdt, diemTichLuy) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = ConnectDB.conn.prepareStatement(sql);

            preparedStatement.setString(1, kh.getMaKH());
            preparedStatement.setString(2, kh.getTenKhachHang());
            preparedStatement.setString(3, kh.getSdt());
            preparedStatement.setLong(5, kh.getDiemTichLuy());
            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static Boolean capNhat(String ma, KhachHang newKh) {
        try {
            String sql = "UPDATE Customer SET tenKhachHang=?, sdt=?, diemTichLuy=?" + "WHERE maKhachHang=?";
            PreparedStatement preparedStatement = ConnectDB.conn.prepareStatement(sql);

            preparedStatement.setString(1, newKh.getTenKhachHang());
            preparedStatement.setString(2, newKh.getSdt());
            preparedStatement.setLong(3, newKh.getDiemTichLuy());

            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

}
