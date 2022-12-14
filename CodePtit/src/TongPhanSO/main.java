	package TongPhanSO;

import java.util.Scanner;

class PhanSo{
	Long x;
	Long y;
	public PhanSo(Long x, Long y) {
		this.x = x;
		this.y = y;
	}
	public PhanSo(int i, int j) {
		// TODO Auto-generated constructor stub
	}
	public Long getX() {
		return this.x;
	}
	public void setX(Long x) {
		this.x = x;
	}
	public Long getY() {
		return y;
	}
	public void setY(Long y) {
		this.y = y;
	}
	public Long UCLN(Long a, Long b) {
		if (a%b==0) return b;
		else return UCLN(b,a%b);	
	}
	public void RutGon() {
		Long h = this.x;
		this.x = this.x / UCLN(this.x, this.y);
		this.y = this.y / UCLN(h, this.y);
	}
}

class Solve{
	private PhanSo x;
	private PhanSo y;
	public PhanSo getX() {
		return x;
	}
	public void setX(PhanSo x) {
		this.x = x;
	}
	public PhanSo getY() {
		return y;
	}
	public void setY(PhanSo y) {
		this.y = y;
	}
	public Solve(PhanSo x, PhanSo y) {
		super();
		this.x = x;
		this.y = y;
	}
	public Long UCLN(Long a, Long b) {
		if(a % b == 0) return b;
		else return UCLN(b, a % b);
	}
	
	public Long BCNN(Long a, Long b) {
		return (Long) ((a * b) / UCLN(a, b));
	}
	public void solve() {
		Long h = BCNN(x.y, y.y);
		PhanSo c = new  PhanSo(0, 0);
		x.x = x.x * (h / x.y);
		y.x = y.x * (h / y.y);
		c.x = x.x + y.x;
		c.y = h;
		c.RutGon();
		System.out.println(c.x + "/" + c.y);
	}
}


public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhanSo x = new PhanSo(sc.nextLong(), sc.nextLong());
		PhanSo y = new PhanSo(sc.nextLong(), sc.nextLong());
		Solve h = new Solve(x, y);
		h.solve();
	}
}
