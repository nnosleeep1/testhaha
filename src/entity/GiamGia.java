package entity;

public class GiamGia {

	private String maGiamGia;
	private String tenGiamGia;
	private String moTa;
	private String donVi;
        private loaiGiamGia loaiGiamGia;

	public GiamGia() {
		throw new UnsupportedOperationException();
	}

    public GiamGia(String maGiamGia, String tenGiamGia, String moTa, String donVi, loaiGiamGia loaiGiamGia) {
        this.maGiamGia = maGiamGia;
        this.tenGiamGia = tenGiamGia;
        this.moTa = moTa;
        this.donVi = donVi;
        this.loaiGiamGia = loaiGiamGia;
    }

    public String getMaGiamGia() {
        return maGiamGia;
    }

    public void setMaGiamGia(String maGiamGia) {
        this.maGiamGia = maGiamGia;
    }

    public String getTenGiamGia() {
        return tenGiamGia;
    }

    public void setTenGiamGia(String tenGiamGia) {
        this.tenGiamGia = tenGiamGia;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public loaiGiamGia getLoaiGiamGia() {
        return loaiGiamGia;
    }

    public void setLoaiGiamGia(loaiGiamGia loaiGiamGia) {
        this.loaiGiamGia = loaiGiamGia;
    }

}