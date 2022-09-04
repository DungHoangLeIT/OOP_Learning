package HelloWorld;

import java.util.Scanner;

public class LuyThua {
	
	static int mod = (int) (1e9 + 7);
	
	public static long PowMod(long a, long b) {
		if(b == 0) return 1;
		if(b == 1) return a;
		long x = PowMod(a, b / 2);
		if(b % 2 == 0) return (x % mod * x % mod) % mod;
		else return (x % mod * x % mod)* a % mod;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i = 1; i <= 20; i++) {
			long a, b;
			a = sc.nextLong();
			b = sc.nextLong();
			if(a == b && b == 0) return;
			System.out.println(PowMod(a, b));
		}
	}
}
