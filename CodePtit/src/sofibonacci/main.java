package sofibonacci;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
	static ArrayList<Long> b = new ArrayList<>();
	public static void fibonacci() {
		b.add(Long.valueOf(0));
		b.add(Long.valueOf(1));
		for(int i = 2; i <= 100; i++) {
			b.add(b.get(i - 2) + b.get(i - 1));
		}
	}
	public static void main(String[] args) {
		fibonacci();
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t != 0) {
			t --;
			long n = sc.nextLong();
			if(b.contains(n)) {
				System.out.println("YES");
			}
			else System.out.println("NO");
		}
	}
}
