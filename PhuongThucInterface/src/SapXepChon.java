
public class SapXepChon implements SapXepInterface {

	@Override
	public void sapXepTang(double[] arr) {
		int n = arr.length;
		int i, j, min;
		for(i = 0; i < n - 1; i++) {
			min = i;
			for(j = i + 1; j < n; j++) {
				if(arr[i] < arr[min]) {
					min = j;
				}
			}
			double temp = arr[min];
			arr[min] = arr[i];
			arr[i] = arr[min];
		}
	}

	@Override
	public void sapXepGiam(double[] arr) {
		int n = arr.length;
		int i, j, min;
		for(i = 0; i < n - 1; i++) {
			min = i;
			for(j = i + 1; j < n; j++) {
				if(arr[i] < arr[min]) {
					min = j;
				}
			}
			double temp = arr[min];
			arr[min] = arr[i];
			arr[i] = arr[min];
		}
	}
	
}
