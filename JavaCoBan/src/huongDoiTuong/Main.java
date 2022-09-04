package huongDoiTuong;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HoaDonCafe HD = new HoaDonCafe("trungnguyen", 5, 100000);
		HoaDonCafe HD2 = new HoaDonCafe("trungnguyen", 5, 100000);
		System.out.println(HD.equals(HD2));
		System.out.println(HD.hashCode());
	}
}
