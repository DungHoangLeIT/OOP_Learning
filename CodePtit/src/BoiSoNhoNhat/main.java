package BoiSoNhoNhat;
import java.util.*;
public class main {
	static Set<Integer> s1 = new TreeSet<Integer>();
	public static void solve(int n) {
		Set<Integer> s = new TreeSet<Integer>();
		int i = 2;
		int dem = 0;
		int[] a = new int[100];
		while(n > 1) {
			if(n % i == 0) {
				n /= i;
				a[dem++] = i;
			}
			else i++;
		}
		if(dem == 0) {
			a[dem++] = n;
		}
		for(int i1 = 0; i1 < dem; i1++) {
			s.add(a[i1]);
		}
		int tmp = 0;
		int[] c = new int[s.size()];
		for(int x : s) {
			c[tmp++] = x;
		}
		for(int x : c) {
			s1.add(x);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			solve(i);
		}
		Long sum = (long) 1;
		for(int x : s1) {
			System.out.println(x);
		}
		
	}
	
}
