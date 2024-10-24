package entity;

public class XuatXu {

	private String maXuatXu;
	private String ten;

	public String getMaXuatXu() {
		return maXuatXu;
	}

	public void setMaXuatXu(String maXuatXu) {
		this.maXuatXu = maXuatXu;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

    public XuatXu(String maXuatXu, String ten) {
        this.maXuatXu = maXuatXu;
        this.ten = ten;
    }

    public XuatXu(String maXuatXu) {
        this.maXuatXu = maXuatXu;
    }
        
	public XuatXu() {
		throw new UnsupportedOperationException();
	}

}