import java.util.Scanner;

import javax.naming.ldap.SortControl;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n + 5];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(SumOfArray.Sum(a, n));
	}

}
