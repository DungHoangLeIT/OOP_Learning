package BaiTap;

public class MayBay extends PhuongTienDiChuyen{
	private String loaiNhienLieu;

	public MayBay(String loaiPhuongTien, HangSanXuat hangSanXuat, String loainhienlieu) {
		super("MayBay", hangSanXuat);
		this.loaiNhienLieu = loainhienlieu;
	}

	public String getLoaiNhienLieu() {
		return loaiNhienLieu;
	}

	public void setLoaiNhienLieu(String loaiNhienLieu) {
		this.loaiNhienLieu = loaiNhienLieu;
	}
	
	@Override
	public double layVanToc() {
		return 500;
	}
	
}
