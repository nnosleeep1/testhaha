/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connect.ConnectDB;
import entity.NhaCungCap;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lemin
 */
public class NhaCungCap_DAO {

    public static ArrayList<NhaCungCap> getAllNhaCungCap() {
        ArrayList<NhaCungCap> list = new ArrayList<>();

        try {
            PreparedStatement ps = ConnectDB.conn.prepareStatement("Select * from NhaCungCap");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String maKhachHang = rs.getString("maNCC");
                String tenKhachHang = rs.getString("tenNCC");
                String diaChi = rs.getString("diaChi");
                String email = rs.getString("email");
                String sdt = rs.getString("sdt");
                boolean trangThai = rs.getBoolean("trangThai");
                NhaCungCap ncc = new NhaCungCap(maKhachHang, tenKhachHang, diaChi, email, sdt, trangThai);
                list.add(ncc);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhaCungCap_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public static NhaCungCap getNhaCungCap(String maNCC) {
        NhaCungCap nhaCungCap = null;
        try {
            PreparedStatement ps = ConnectDB.conn.prepareStatement("SELECT * FROM NhaCungCap WHERE maNCC = ?");
            ps.setString(1, maNCC);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String maKhachHang = rs.getString("maNCC");
                String tenKhachHang = rs.getString("tenNCC");
                String diaChi = rs.getString("diaChi");
                String email = rs.getString("email");
                String sdt = rs.getString("sdt");
                boolean trangThai = rs.getBoolean("trangThai");
                nhaCungCap = new NhaCungCap(maKhachHang, tenKhachHang, diaChi, email, sdt, trangThai);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nhaCungCap;
    }
}
