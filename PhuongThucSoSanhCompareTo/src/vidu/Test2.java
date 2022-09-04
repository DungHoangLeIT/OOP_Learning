package vidu;
import java.util.Arrays;

import vidu.SinhVien;

public class Test2 {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien(150, "Le Hoang Mung", "Lop 1", 9);
		SinhVien sv2 = new SinhVien(100, "Le Hoang Dai", "Lop 2", 7);
		SinhVien sv3 = new SinhVien(100, "Le Hoang Trung", "Lop 3", 8);
		SinhVien[] a_sv = new SinhVien[] {sv1, sv2, sv3};
		Arrays.sort(a_sv);
		
		for(int i = 0; i < 3; i++) {
			System.out.println(a_sv[i]);
		}
	}
}
