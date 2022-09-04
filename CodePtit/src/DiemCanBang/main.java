package DiemCanBang;

import java.util.Scanner;

public class main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int t = sc.nextInt();
		while(t != 0) {
			int n = sc.nextInt();
			int[] a = new int[n + 1];
			int sum = 0;
			for(int i = 1; i <= n; i++) {
				a[i] = sc.nextInt();
				sum += a[i];
			}
			int ok = 1;
			for(int i = 2; i <= n; i++) {
				int sumArrR = 0;
				int sumArrL = 0;
				for(int j = i + 1; j <= n; j++) {
					sumArrR += a[j];
				}
				for(int j = 1; j <= i - 1; j++) {
					sumArrL += a[j];
				}
				if(sumArrR == sumArrL) {
					System.out.println(i);
					ok = 0;
					break;
				}
			}
			if(ok == 1) System.out.println(-1);
		}
	}
}
