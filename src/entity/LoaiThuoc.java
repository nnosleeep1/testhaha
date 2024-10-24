package entity;

public class LoaiThuoc {

	public String getMaLoai() {
		return maLoai;
	}

	public void setMaLoai(String maLoai) {
		this.maLoai = maLoai;
	}

	public String getTenLoai() {
		return tenLoai;
	}

	public void setTenLoai(String tenLoai) {
		this.tenLoai = tenLoai;
	}

    public LoaiThuoc(String maLoai, String tenLoai) {
        this.maLoai = maLoai;
        this.tenLoai = tenLoai;
    }

    public LoaiThuoc(String maLoai) {
        this.maLoai = maLoai;
    }
        
	private String maLoai;
	private String tenLoai;

        @Override
	public String toString() {
		throw new UnsupportedOperationException();
	}

}