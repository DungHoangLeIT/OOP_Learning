package PhuongThucTruuTuong;

public class HinhChuNhat extends Hinh {
	private double width;
	private double length;
	
	public HinhChuNhat(ToaDo toaDo, double width, double length) {
		super(toaDo);
		this.length = length;
		this.width = width;
	}
	
	@Override
	public double tinhDienTich() {
		return width * length;
	}
}
