
public class PhanMemMayTinh implements MayTinhBoTuiInterface, SapXepInterface {

	@Override
	public void sapXepTang(double[] a) {
		int n = a.length;
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				if(a[i] < a[j]) {
					double t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
	}

	@Override
	public void sapXepGiam(double[] a) {
		int n = a.length;
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				if(a[i] > a[j]) {
					double t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
	}

	@Override
	public double cong(double a, double b) {
		return a + b;
	}

	@Override
	public double tru(double a, double b) {
		return a - b;
	}

	@Override
	public double nhan(double a, double b) {
		return a * b;
	}

	@Override
	public double chia(double a, double b) {
		return a / b;
	}

}
