package TinhToanPhanSo;
import java.util.*;
class PhanSo{
	public int x;
	public int y;
	public PhanSo(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int UCLN(int a, int b) {
		if(a % b == 0) return b;
		else return UCLN(b, a % b);
	}
	public void rutGon() {
		int uc = UCLN(this.x, this.y);
		this.x = this.x / uc;
		this.y = this.y / uc;
	}
}

class TinhToanPhanSo1{
	public PhanSo a;
	public PhanSo b;
	public TinhToanPhanSo1(PhanSo a, PhanSo b) {
		super();
		this.a = a;
		this.b = b;
	}
	public PhanSo getA() {
		return a;
	}
	public void setA(PhanSo a) {
		this.a = a;
	}
	public PhanSo getB() {
		return b;
	}
	public void setB(PhanSo b) {
		this.b = b;
	}
	public int UCLN(int a, int b) {
		if(a % b == 0) return b;
		else return UCLN(b, a % b);
	}
	PhanSo c = new PhanSo(0, 0);
	public PhanSo phepToan1() {
		a.rutGon();
		b.rutGon();
		int h = (a.y * b.y) / UCLN(a.y, b.y);
		a.x = (h / a.y) * a.x;
		b.x = (h / b.y) * b.x;
		c.x = (a.x + b.x) * (a.x + b.x);
		c.y = b.y * b.y;
		c.rutGon();
		return c;
	}
}

class TinhToanPhanSo2{
	private PhanSo a;
	private PhanSo b;
	private PhanSo c;
	public TinhToanPhanSo2(PhanSo a, PhanSo b, PhanSo c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public PhanSo getA() {
		return a;
	}
	public void setA(PhanSo a) {
		this.a = a;
	}
	public PhanSo getB() {
		return b;
	}
	public void setB(PhanSo b) {
		this.b = b;
	}
	public PhanSo getC() {
		return c;
	}
	public void setC(PhanSo c) {
		this.c = c;
	}
	public PhanSo phepToan2(){
		PhanSo d = new PhanSo(0, 0);
		d.x = a.x * b.x * c.x;
		d.y = a.y * b.y * c.y;
		d.rutGon();`
		return d;
	}
}

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int t = sc.nextInt();
		while(t != 0) {
			t -= 1;
			int x1,y1,x2,y2;
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			x2 = sc.nextInt();
			y2 = sc.nextInt();
			PhanSo a = new PhanSo(x1, y1);
			PhanSo b = new PhanSo(x2, y2);
			TinhToanPhanSo1 t1 = new TinhToanPhanSo1(a, b);
			PhanSo c = t1.phepToan1();
			System.out.print(c.x + "/" + c.y + " ");
			PhanSo a1 = new PhanSo(x1, y1);
			PhanSo a2 = new PhanSo(x2, y2);
			System.out.println(c.x + " "  + c.y);
			TinhToanPhanSo2 t2 = new TinhToanPhanSo2(a1, a2, c);
			PhanSo d = t2.phepToan2();
			System.out.println(d.x + "/" + d.y);
		}
	}
}
