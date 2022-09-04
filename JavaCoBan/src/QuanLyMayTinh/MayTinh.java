package QuanLyMayTinh;


public class MayTinh {
	private HangSanXuat hangSanXuat;
	private Ngay ngay;
	private double giaBan;
	private int thoiGianBaoHanh;
	public MayTinh(HangSanXuat hangSanXuat, Ngay ngay, double giaBan, int thoiGianBaoHanh) {
		super();
		this.hangSanXuat = hangSanXuat;
		this.ngay = ngay;
		this.giaBan = giaBan;
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}
	public HangSanXuat getHangSanXuat() {
		return hangSanXuat;
	}
	public void setHangSanXuat(HangSanXuat hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}
	public Ngay getNgay() {
		return ngay;
	}
	public void setNgay(Ngay ngay) {
		this.ngay = ngay;
	}
	public double getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}
	public int getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}
	public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}
	
	public boolean KiemTraGiaBan(MayTinh mayTinhKhac) {
		return this.giaBan < mayTinhKhac.giaBan;
	}
	
	public String TenQuocGiaSanXuat() {
		return this.hangSanXuat.LayTenQuocGia();
	}
}
