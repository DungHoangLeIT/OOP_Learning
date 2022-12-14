package PhanSo;

import java.util.Scanner;

class PhanSo{
	private Long x;
	private Long y;
	public PhanSo(Long x, Long y) {
		this.x = x;
		this.y = y;
	}
	public Long getX() {
		return x;
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
	public void solve() {
		Long h = this.x;
		this.x = this.x / UCLN(this.x, this.y);
		this.y = this.y / UCLN(h, this.y);
		System.out.println(this.x + "/" + this.y);
	}
}

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhanSo ps = new PhanSo(sc.nextLong(), sc.nextLong());
		ps.solve();
	}
}
