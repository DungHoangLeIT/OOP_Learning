package XuLiChuoi;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] a1 = new int[] {1,2,3};
		int[] a2 = a1.clone();
		a2[0] = 2;
		for(int i = 0; i < 3; i++) {
			System.out.println(a1[i]);
		}
	}
}
