package QuanLiSach;

public class main {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(21, 4, 2002);
		Ngay ngay2 = new Ngay(3, 10, 2002);
		Ngay ngay3 = new Ngay(21, 4, 2002);
		
		TacGia tg1 = new TacGia("HoangDung", ngay1);
		TacGia tg2 = new TacGia("Leen", ngay2);
		TacGia tg3 = new TacGia("Dung", ngay3);
		
		Sach s1 = new Sach("doraemon", 20000, 1945, tg1);
		Sach s2 = new Sach("doraemi", 20000, 1946, tg2);
		Sach s3 = new Sach("nobita", 20000, 1945, tg3);
		
		s1.inTenSach();
		s2.inTenSach();
		s3.inTenSach();
		
		System.out.println("Sach 1 giam 10%: "+ s1.giaSauKhiGiam(10));
		System.out.println("Sach 2 giam 20%: "+ s2.giaSauKhiGiam(20));
		System.out.println("Sach 3 giam 50%: "+ s3.giaSauKhiGiam(50));
	}
}
