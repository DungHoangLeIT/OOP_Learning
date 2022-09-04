package SoTamPhan;

import java.util.Scanner;

public class main {
	
	public static int check(String s) {
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) != '2' && s.charAt(i) != '1' && s.charAt(i) != '0') return 0;
		}
		return 1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 1; i <= t; i++) {
			String s = sc.next();
			if(check(s) == 1) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}	
