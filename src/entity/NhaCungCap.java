package entity;

public class NhaCungCap {

	private String maNCC;
	private String tenNCC;
	private String diaChi;
	private String email;
	private String sdt;
	private boolean trangThai;
	
	

        public String getMaNCC() {
		return maNCC;
	}



	public void setMaNCC(String maNCC) {
		this.maNCC = maNCC;
	}



	public String getTenNCC() {
		return tenNCC;
	}



	public void setTenNCC(String tenNCC) {
		this.tenNCC = tenNCC;
	}



	public String getDiaChi() {
		return diaChi;
	}



	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getSdt() {
		return sdt;
	}



	public void setSdt(String sdt) {
		this.sdt = sdt;
	}



	public boolean isTrangThai() {
		return trangThai;
	}



	public void setTrangThai(boolean trangThai) {
		this.trangThai = trangThai;
	}



		@Override
	public String toString() {
		throw new UnsupportedOperationException();
	}

}