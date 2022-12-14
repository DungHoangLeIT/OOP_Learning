package GiaoCuaHaiDaySo;

import java.util.*;

public class main {
	public static int BinarySearch(int n, int a[], int x) {
		int l = 0;
		int r = n - 1;
		while(l <= r) {
			int m = (l + r) / 2;
			if(a[m] == x) return x;
			else if(a[m] < x) {
				l = m + 1;
			}
			else r = m - 1;
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[m];
		for(int i = 0; i < n; i++) a[i] = sc.nextInt();
		Set<Integer> s = new TreeSet<Integer>();
		Set<Integer> s1 = new TreeSet<Integer>();
		for(int i = 0; i < n; i++) s.add(a[i]);
		int[] c = new int[s.size()];
		int tmp = 0;
		for(int i : s) {
			c[tmp++] = i;
		}
		for(int i = 0; i < m; i++) b[i] = sc.nextInt();
		for(int i = 0; i < m; i++) s1.add(b[i]);
		int[] d = new int[s1.size()];
		int tmp1 = 0;
		for(int i : s1) {
			d[tmp1++] = i;
		}
		for(int i = 0; i < s.size(); i++) {
			for(int j = 0; j < s1.size(); j++) {
				if(BinarySearch(s1.size(), d, c[i]) != 0) {
					System.out.print(c[i] + " ");
					break;
				}
			}
		}
	}
}
