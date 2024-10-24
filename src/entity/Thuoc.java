package entity;

import java.time.LocalDate;

public class Thuoc {

	private String maThuoc;
	private String tenThuoc;
	private double gia;
	private LocalDate hsd;
	private LocalDate nsx;
	private double thue;
	private int soLuongTon;
	private String mota;
        private LoaiThuoc loaiThuoc;
        private XuatXu xuatXu;
        private DonViTinh donViTinh;
        private NhaCungCap ncc;
        private GiamGia giamGia;

    public Thuoc(String maThuoc, String tenThuoc, double gia, LocalDate toLocalDate, LocalDate toLocalDate0, double thue, int soLuongTon, String mota, Object object, Object object0, Object object1, Object object2, Object object3) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        this.maThuoc=maThuoc;
        this.tenThuoc=tenThuoc;
        this.gia=gia;
        this.thue=thue;
    }
        
        public String getMaThuoc() {
		return maThuoc;
	}


	public void setMaThuoc(String maThuoc) {
		this.maThuoc = maThuoc;
	}


	public String getTenThuoc() {
		return tenThuoc;
	}


	public void setTenThuoc(String tenThuoc) {
		this.tenThuoc = tenThuoc;
	}


	public double getGia() {
		return gia;
	}


	public void setGia(double gia) {
		this.gia = gia;
	}


	public LocalDate getHsd() {
		return hsd;
	}


	public void setHsd(LocalDate hsd) {
		this.hsd = hsd;
	}


	public LocalDate getNsx() {
		return nsx;
	}


	public void setNsx(LocalDate nsx) {
		this.nsx = nsx;
	}


	public double getThue() {
		return thue;
	}


	public void setThue(double thue) {
		this.thue = thue;
	}


	public int getSoLuongTon() {
		return soLuongTon;
	}


	public void setSoLuongTon(int soLuongTon) {
		this.soLuongTon = soLuongTon;
	}


	public String getMota() {
		return mota;
	}


	public void setMota(String mota) {
		this.mota = mota;
	}


	public LoaiThuoc getLoaiThuoc() {
		return loaiThuoc;
	}


	public void setLoaiThuoc(LoaiThuoc loaiThuoc) {
		this.loaiThuoc = loaiThuoc;
	}


	public XuatXu getXuatXu() {
		return xuatXu;
	}


	public void setXuatXu(XuatXu xuatXu) {
		this.xuatXu = xuatXu;
	}


	public DonViTinh getDonViTinh() {
		return donViTinh;
	}


	public void setDonViTinh(DonViTinh donViTinh) {
		this.donViTinh = donViTinh;
	}


	public NhaCungCap getNcc() {
		return ncc;
	}


	public void setNcc(NhaCungCap ncc) {
		this.ncc = ncc;
	}


	public GiamGia getGiamGia() {
		return giamGia;
	}


	public void setGiamGia(GiamGia giamGia) {
		this.giamGia = giamGia;
	}
       

}