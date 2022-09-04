package TongGiaiThua;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Long sum = (long) 0;
		Long[] f = new Long[n + 5];
		for(int i = 1; i <= n; i++) {
			f[i] = (long) 1;
			for(int j = 1; j <= i; j++) {
				f[i] = f[i] * j;
			}
		}
		for(int i = 1; i <= n; i++) {
			sum += f[i];
		}
		System.out.println(sum);
	}
}
