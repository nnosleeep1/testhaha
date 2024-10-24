package entity;

import java.util.Objects;

public class NhaCungCap {

    /**
     * @return the maNCC
     */
    public String getMaNCC() {
        return maNCC;
    }

    /**
     * @param maNCC the maNCC to set
     */
    public void setMaNCC(String maNCC) {
        this.maNCC = maNCC;
    }

    /**
     * @return the tenNCC
     */
    public String getTenNCC() {
        return tenNCC;
    }

    /**
     * @param tenNCC the tenNCC to set
     */
    public void setTenNCC(String tenNCC) {
        this.tenNCC = tenNCC;
    }

    /**
     * @return the diaChi
     */
    public String getDiaChi() {
        return diaChi;
    }

    /**
     * @param diaChi the diaChi to set
     */
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the sdt
     */
    public String getSdt() {
        return sdt;
    }

    /**
     * @param sdt the sdt to set
     */
    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    /**
     * @return the trangThai
     */
    public boolean isTrangThai() {
        return trangThai;
    }

    /**
     * @param trangThai the trangThai to set
     */
    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    private String maNCC;
    private String tenNCC;
    private String diaChi;
    private String email;
    private String sdt;
    private boolean trangThai;

    public NhaCungCap(String maNCC, String tenNCC, String diaChi, String email, String sdt, boolean trangThai) {
        this.maNCC = maNCC;
        this.tenNCC = tenNCC;
        this.diaChi = diaChi;
        this.email = email;
        this.sdt = sdt;
        this.trangThai = trangThai;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.getMaNCC());
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
        final NhaCungCap other = (NhaCungCap) obj;
        return Objects.equals(this.getMaNCC(), other.getMaNCC());
    }

}
