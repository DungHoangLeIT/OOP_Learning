package KhaiBaoLopHCN;

import java.util.Scanner;

class Rectange{
	private double width;
	private double height;
	private String color;
	
	public Rectange() {}
	public Rectange(double width, double height, String color) {
		this.color = color;
		this.height = height;
		this.width = width;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void findArea() {
		System.out.print(this.height * this.width + " ");
	}
	public void findPerimeter() {
		System.out.print(this.height * 2 + this.width * 2 + " ");
	}
}

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectange r1 = new Rectange(sc.nextDouble(), sc.nextDouble(), sc.next());
		r1.findPerimeter();
		r1.findArea();
		r1.getColor();
	}
}
