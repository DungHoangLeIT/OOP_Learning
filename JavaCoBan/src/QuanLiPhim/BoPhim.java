package QuanLiPhim;

public class BoPhim {
	private String tenPhim;
	private int namSanXuat;
	private HangSanXuat hangSanXuat;
	private double giaVe;
	private Ngay ngay;
	
	public BoPhim(String tenPhim, int namSanXuat, HangSanXuat hangSanXuat, double giaVe, Ngay ngay) {
		super();
		this.tenPhim = tenPhim;
		this.namSanXuat = namSanXuat;
		this.hangSanXuat = hangSanXuat;
		this.giaVe = giaVe;
		this.ngay = ngay;
	}

	public String getTenPhim() {
		return tenPhim;
	}

	public void setTenPhim(String tenPhim) {
		this.tenPhim = tenPhim;
	}

	public int getNamSanXuat() {
		return namSanXuat;
	}

	public void setNamSanXuat(int namSanXuat) {
		this.namSanXuat = namSanXuat;
	}

	public HangSanXuat getHangSanXuat() {
		return hangSanXuat;
	}

	public void setHangSanXuat(HangSanXuat hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}

	public double getGiaVe() {
		return giaVe;
	}

	public void setGiaVe(double giaVe) {
		this.giaVe = giaVe;
	}

	public Ngay getNgay() {
		return ngay;
	}

	public void setNgay(Ngay ngay) {
		this.ngay = ngay;
	}
	
	public boolean kiemTraGiaVeReHon(BoPhim phimKhac) {
		return this.getGiaVe() <= phimKhac.giaVe;
	}
	
	public void tenHangSanXuat() {
		System.out.println("Ten Hang: " + this.tenPhim);
	}
	
	public double giaVeSauKhiGiam(double x) {
		return this.giaVe - this.giaVe * (x / 100);
	}
}
