package QuanLySinhVien;

import java.util.Objects;

public class SinhVien {
	private String maSoSinhVien;
	private String hoVaTen;
	private NgaySinh ngaySinh;
	private double diemTrungBinh;
	private Lop lop;
	
	public SinhVien(String maSoSinhVien, String hoVaTen, NgaySinh ngaySinh, double diemTrungBinh, Lop lop) {
		super();
		this.maSoSinhVien = maSoSinhVien;
		this.hoVaTen = hoVaTen;
		this.ngaySinh = ngaySinh;
		this.diemTrungBinh = diemTrungBinh;
		this.lop = lop;
	}

	public String getMaSoSinhVien() {
		return maSoSinhVien;
	}

	public void setMaSoSinhVien(String maSoSinhVien) {
		this.maSoSinhVien = maSoSinhVien;
	}

	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public NgaySinh getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(NgaySinh ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}

	public Lop getLop() {
		return lop;
	}

	public void setLop(Lop lop) {
		this.lop = lop;
	}
	
	public void TenKhoa() {
		System.out.println(this.lop.getTenKhoa());
	}
	
	public boolean KiemTraThiDat() {
		return this.diemTrungBinh >= 5;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ngaySinh);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SinhVien other = (SinhVien) obj;
		return Objects.equals(ngaySinh, other.ngaySinh);
	}
	
	public boolean KiemTraCungNgaySinh(SinhVien sinhVienKhac) {
		return this.ngaySinh.equals(sinhVienKhac);
	}
	
}
