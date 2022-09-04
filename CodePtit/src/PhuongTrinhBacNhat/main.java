package PhuongTrinhBacNhat;

import java.util.Scanner;

public class main {
	
	public static int check(int n) {
		if(n < 2) return 0;
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) return 0;
		}
		return 1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for(int j = 1; j <= t; j++) {
			int n = sc.nextInt();
			if(check(n) == 1) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}
