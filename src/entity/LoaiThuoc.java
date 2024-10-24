package entity;

import java.util.Objects;

public class LoaiThuoc {

	private String maLoai;
	private String tenLoai;

    /**
     * @return the maLoai
     */
    public String getMaLoai() {
        return maLoai;
    }

    /**
     * @param maLoai the maLoai to set
     */
    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }

    /**
     * @return the tenLoai
     */
    public String getTenLoai() {
        return tenLoai;
    }

    /**
     * @param tenLoai the tenLoai to set
     */
    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.maLoai);
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
        final LoaiThuoc other = (LoaiThuoc) obj;
        return Objects.equals(this.maLoai, other.maLoai);
    }

    public LoaiThuoc(String maLoai, String tenLoai) {
        this.maLoai = maLoai;
        this.tenLoai = tenLoai;
    }

       
}