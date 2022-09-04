package huongDoiTuong;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public MyDate(int d, int m, int y) {
		this.day = d;
		this.month = m;
		this.year = y;
	}
	
	public void PrintDay() {
		System.out.println(this.day);
	}
	
	public void PrintMonth() {
		System.out.println(this.month);
	}
	
	public void PrintYear() {
		System.out.println(this.year);
	}
}
