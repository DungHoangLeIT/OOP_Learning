package UclnBcnn;

import java.util.Scanner;

public class main {
	public static Long UCLN(Long a, Long b) {
		while(a != b) {
			if(a > b) {
				a = a - b;
			}
			else b = b - a;
		}
		return (Long) a;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t != 0) {
			t--;
			Long a = sc.nextLong();
			Long  b = sc.nextLong();
			System.out.println((a * b) / UCLN(a, b) + " " + UCLN(a, b));
		}
	}
}
