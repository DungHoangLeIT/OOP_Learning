package PhuongThucTruuTuong;

public class main {
	public static void main(String[] args) {
		ToaDo td1 = new ToaDo(5, 5);
		ToaDo td2 = new ToaDo(7, 9);
		ToaDo td3 = new ToaDo(12, 1);
		
		Hinh h1 = new Diem(td1);
		Hinh h2 = new HinhTron(td2,3);
		Hinh h3 = new HinhChuNhat(td3,2,3);
		
		System.out.println(h1.tinhDienTich());
		System.out.println(h2.tinhDienTich());
		System.out.println(h3.tinhDienTich());
	}
}
