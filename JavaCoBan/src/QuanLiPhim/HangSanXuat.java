package QuanLiPhim;

public class HangSanXuat {	
	private String tenHangSanXuat;
	private String quocGia;
	
	public HangSanXuat(String ten, String nuoc) {
		this.tenHangSanXuat = ten;
		this.quocGia = nuoc;
	}

	public String getTenHangSanXuat() {
		return tenHangSanXuat;
	}

	public void setTenHangSanXuat(String tenHangSanXuat) {
		this.tenHangSanXuat = tenHangSanXuat;
	}

	public String getQuocGia() {
		return quocGia;
	}

	public void setQuocGia(String quocGia) {
		this.quocGia = quocGia;
	}
	
	
}
