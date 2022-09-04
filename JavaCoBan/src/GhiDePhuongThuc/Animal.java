package GhiDePhuongThuc;

public class Animal {
	protected String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void Eat() {
		System.out.println("toi dang an");
	}
	
	public void Ngu() {
		System.out.println("toi dang ngu");
	}
	
	public void Drink() {
		System.out.println("toi dang an");
	}
}
