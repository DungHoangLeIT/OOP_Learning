package InMaTran;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m;
		n = sc.nextInt();
		int[][] a = new int[n + 1][n + 1];
		int[][] b = new int[n + 1][n + 1];
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				a[i][j] = sc.nextInt();
				b[i][j] = a[i][j];
			}
		}
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				System.out.println(a[i] + " ");
			}
		}
//		for(int i = 1; i <= n; i++) {
//			if(i % 2 == 1) {
//				for(int j = 1; j <= n; j++) {
//					System.out.print(a[i] + " ");
//				}
//			}
//			else {
//				for(int j = n; j >= 1; j--) {
//					System.out.println(b[i] + " ");
//				}
//			}
//		}
	}
}
