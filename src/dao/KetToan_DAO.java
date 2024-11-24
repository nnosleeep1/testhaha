/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connect.ConnectDB;
import entity.HoaDon;
import entity.KetToan;
import entity.BangKiemTien;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author lemin
 */
public class KetToan_DAO {

    private BangKiemTien_DAO bangKiemTien_DAO = new BangKiemTien_DAO();

    public KetToan_DAO() {
    }

    public KetToan getOne(String maKetToan) {
        KetToan ketToan = null;
        try {
            String sql = "SELECT * FROM KetToan WHERE maKetToan = ?";
            PreparedStatement preparedStatement = ConnectDB.conn.prepareStatement(sql);
            preparedStatement.setString(1, maKetToan);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {

                Timestamp diemBatDau = resultSet.getTimestamp("ngayBatDau");
                Timestamp diemKetThuc = resultSet.getTimestamp("ngayKetKhuc");

                Date ngayBatDau = new java.sql.Date(diemBatDau.getTime());
                Date ngayKetThuc = new java.sql.Date(diemKetThuc.getTime());
                String maBangKiemTien = resultSet.getString("maBangKiemTien");

                ketToan = new KetToan(maKetToan, ngayBatDau, ngayKetThuc, BangKiemTien_DAO.getOne(maBangKiemTien), new HoaDon_DAO().getAllOrderInAcountingVoucher(maKetToan));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ketToan;
    }

    public ArrayList<KetToan> getAll() {
        ArrayList<KetToan> ketToans = new ArrayList<>();

        try {
            String sql = "SELECT * FROM KetToan";
            PreparedStatement preparedStatement = ConnectDB.conn.prepareStatement(sql);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String maKetToan = resultSet.getString("maKetToan");
                Timestamp diemBatDau = resultSet.getTimestamp("ngayBatDau");
                Timestamp diemKetThuc = resultSet.getTimestamp("ngayKetThuc");

                Date ngayBatDau = new java.sql.Date(diemBatDau.getTime());
                Date ngayKetThuc = new java.sql.Date(diemKetThuc.getTime());

                String maBangKiemTien = resultSet.getString("maBangKiemTien");
                BangKiemTien bangKiemTien = bangKiemTien_DAO.getOne(maBangKiemTien);

                ArrayList<HoaDon> listHoaDon = new HoaDon_DAO().getAllOrderInAcountingVoucher(maKetToan);

                KetToan ketToan = new KetToan(maKetToan, ngayBatDau, ngayKetThuc, bangKiemTien, new HoaDon_DAO().getAllOrderInAcountingVoucher(maKetToan));

                ketToans.add(ketToan);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ketToans;
    }

    public Boolean create(KetToan ketToan) {
        try {
            String sql = "INSERT INTO KetToan (maKetToan, ngayBatDau, ngayKetThuc, maBangKiemTien) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = ConnectDB.conn.prepareStatement(sql);

            preparedStatement.setString(1, ketToan.getMaKetToan());

            Timestamp end = new Timestamp(ketToan.getNgayKetThuc().getTime());
            preparedStatement.setTimestamp(3, end);

            Timestamp start = new Timestamp(ketToan.getNgayBatDau().getTime());
            preparedStatement.setTimestamp(2, start);

            preparedStatement.setString(4, ketToan.getBangKiemTien().getMaBangKiemTien());
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                return true; // Thành công
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false; // Thất bại
    }
}
