package XauNhiPhan;

import java.util.Scanner;

public class main {
	
	private static Scanner sc = new Scanner(System.in);
	static long[] f = new long[100];
	
	static void solve() {
		long n, i;
		n = sc.nextLong();
		i = sc.nextLong();
		while(n > 2) {
			if(i <= f[(int) (n - 2)]) n -= 2;
			else {
				i -= f[(int) (n - 2)];
				n -= 1;
			}
		}
		if(n == 1) System.out.println('0');
		else System.out.println('1');
	}
	
	public static void main(String[] args) {
		f[1] = f[2] = 1;
		for(int i = 3; i <= 92; i++) {
			f[i] = f[i - 1] + f[i - 2];
		} 
		
		int t = Integer.parseInt(sc.nextLine());
		for(int i = 1; i <= t; i++) {
			solve();
		}
	}
}
