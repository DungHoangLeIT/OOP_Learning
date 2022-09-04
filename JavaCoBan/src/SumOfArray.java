
public class SumOfArray {
	public static int Sum(int[] a, int n){
		if(n == 1) return a[0];
		return a[n - 1] + Sum(a, n - 1);
	}
}
