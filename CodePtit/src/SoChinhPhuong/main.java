package SoChinhPhuong;

import java.util.*;

public class main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int t = sc.nextInt();
		while(t != 0) {
			t -= 1;
			int n = sc.nextInt();
			int h = (int)Math.sqrt(n);
			if(h * h == n) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}
