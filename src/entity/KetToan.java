/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author lemin
 */
public class KetToan implements Comparable<KetToan> {


    private String maKetToan;
    private Date ngayBatDau;
    private Date ngayKetThuc;
    private BangKiemTien bangKiemTien;
    private ArrayList<HoaDon> listHoaDon;

    public KetToan() {
    }

    public KetToan(String maKetToan, Date ngayBatDau, Date ngayKetThuc, BangKiemTien bangKiemTien, ArrayList<HoaDon> listHoaDon) {
        this.maKetToan = maKetToan;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.bangKiemTien = bangKiemTien;
        this.listHoaDon = listHoaDon;
    }

    public String getMaKetToan() {
        return maKetToan;
    }

    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public BangKiemTien getBangKiemTien() {
        return bangKiemTien;
    }

    public ArrayList<HoaDon> getListHoaDon() {
        return listHoaDon;
    }

    public void setMaKetToan(String maKetToan) {
        this.maKetToan = maKetToan;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public void setBangKiemTien(BangKiemTien bangKiemTien) {
        this.bangKiemTien = bangKiemTien;
    }

    public void setListHoaDon(ArrayList<HoaDon> listHoaDon) {
        this.listHoaDon = listHoaDon;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.maKetToan);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final KetToan other = (KetToan) obj;
        return Objects.equals(this.maKetToan, other.maKetToan);
    }

    @Override
    public int compareTo(KetToan o) {
        return this.ngayBatDau.compareTo(o.ngayBatDau);
    }

}
