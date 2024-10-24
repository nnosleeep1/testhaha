package entity;

public class DonViTinh {

	private String maDonViTinh;
	private String ten;

    public DonViTinh(String maDonViTinh, String ten) {
        this.maDonViTinh = maDonViTinh;
        this.ten = ten;
    }

    public String getMaDonViTinh() {
        return maDonViTinh;
    }

    public void setMaDonViTinh(String maDonViTinh) {
        this.maDonViTinh = maDonViTinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public DonViTinh(String maDonViTinh) {
        this.maDonViTinh = maDonViTinh;
    }

	

}