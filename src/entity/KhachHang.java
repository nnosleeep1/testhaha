package entity;

import java.util.Objects;

public class KhachHang {

    private String maKH;
    private String tenKhachHang;
    private String sdt;
    private long diemTichLuy;

    public String getMaKH() {
        return maKH;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public String getSdt() {
        return sdt;
    }

    public long getDiemTichLuy() {
        return diemTichLuy;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setDiemTichLuy(long diemTichLuy) {
        this.diemTichLuy = diemTichLuy;
    }

    public KhachHang(String maKH, String tenKhachHang, String sdt, long diemTichLuy) {
        this.maKH = maKH;
        this.tenKhachHang = tenKhachHang;
        this.sdt = sdt;
        this.diemTichLuy = diemTichLuy;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.maKH);
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
        final KhachHang other = (KhachHang) obj;
        return Objects.equals(this.maKH, other.maKH);
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException();
    }

}
