/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connect.ConnectDB;
import entity.BangKiemTien;
import entity.KiemTien;
import entity.ChiTietBangKiemTien;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

/**
 *
 * @author lemin
 */
class BangKiemTien_DAO {

    private KiemTien_DAO kiemTien_DAO = new KiemTien_DAO();
    private ChiTietBangKiemTien_DAO chiTietBangKiemTien_DAO = new ChiTietBangKiemTien_DAO();

    public BangKiemTien getOne(String id) {
        BangKiemTien bangKiemTien = null;

        try {
            String sql = "SELECT * FROM BangKiemTien WHERE maBangKiemTien = ?";
            PreparedStatement preparedStatement = ConnectDB.conn.prepareStatement(sql);
            preparedStatement.setString(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                Timestamp diemBatDau = resultSet.getTimestamp("ngayBatDau");
                Timestamp diemKetThuc = resultSet.getTimestamp("ngayKetThuc");

                Date ngayBatDau = new Date(diemBatDau.getTime());
                Date ngayKetThuc = new Date(diemKetThuc.getTime());

                bangKiemTien = new BangKiemTien(id,kiemTien_DAO.getAll(id), ngayBatDau, ngayKetThuc, chiTietBangKiemTien_DAO.getAllCashCountSheetDetailInCashCountSheet(id));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return bangKiemTien;
    }

    public ArrayList<BangKiemTien> getAll() {
        ArrayList<BangKiemTien> bangKiemTiens = new ArrayList<>();

        try {
            String sql = "SELECT * FROM BangKiemTien";
            PreparedStatement preparedStatement = ConnectDB.conn.prepareStatement(sql);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String maBangKiemTien = resultSet.getString("maBangKiemTien");
                Timestamp diemBatDau = resultSet.getTimestamp("ngayBatDau");
                Timestamp diemKetThuc = resultSet.getTimestamp("ngayKetThuc");

                Date ngayBatDau = new Date(diemBatDau.getTime());
                Date ngayKetThuc = new Date(diemKetThuc.getTime());
                BangKiemTien bangKiemTien = new BangKiemTien(maBangKiemTien, new KiemTien_DAO().getAll(maBangKiemTien), ngayBatDau, ngayKetThuc,new ChiTietBangKiemTien_DAO().getAllCashCountSheetDetailInCashCountSheet(maBangKiemTien));

                bangKiemTiens.add(bangKiemTien);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return bangKiemTiens;
    }

    public Boolean create(BangKiemTien bangKiemTien
    ) {
        try {
            // Thêm bản ghi vào bảng BangKiemTien
            String bangKiemTienSql = "INSERT INTO BangKiemTien (maBangKiemTien, ngayBatDau, ngayKetThuc) VALUES (?, ?, ?)";
            PreparedStatement bangKiemTienStatement = ConnectDB.conn.prepareStatement(bangKiemTienSql);
            bangKiemTienStatement.setString(1, bangKiemTien.getMaBangKiemTien());

            Timestamp end = new Timestamp(bangKiemTien.getNgayKetThuc().getTime());
            bangKiemTienStatement.setTimestamp(2, end);

            Timestamp start = new Timestamp(bangKiemTien.getNgayBatDau().getTime());
            bangKiemTienStatement.setTimestamp(3, start);
            int bangKiemTienRowsAffected = bangKiemTienStatement.executeUpdate();
            for (KiemTien kiemTien : bangKiemTien.getListKiemTien()) {
                kiemTien_DAO.create(kiemTien, bangKiemTien.getMaBangKiemTien());
            }
            // Thêm bản ghi vào bảng ChiTietBangKiemTien
            for (ChiTietBangKiemTien chiTietBangKiemTien : bangKiemTien.getListChiTietBangKiemTien()) {
                chiTietBangKiemTien_DAO.create(chiTietBangKiemTien);
            }
            // Nếu tất cả các bảng đều thêm bản ghi thành công
            if (bangKiemTienRowsAffected > 0) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
