package PhanTichThuaSoNguyenTO;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int test = 1;
		while(t != 0) {
			t -= 1;
			int n = sc.nextInt();
			int a = 2;
			int tmp = 0;
			System.out.print("Test " + test +": ");
            test+=1;
			while(n != 1) {
				if(n % a == 0) {
					tmp ++;
					n /= a;
					if(n == 1) {
						System.out.print(a + "(" + tmp + ") ");
					}
				}
				else {
					if(tmp != 0) {
						System.out.print(a + "(" + tmp + ") ");
						tmp = 0;
					}
					a++;
				}
			}
			System.out.println();
		}
	}
}
