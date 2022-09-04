package huongDoiTuong;

import java.util.Objects;

public class HoaDonCafe {
	private String name;
	private double weight;
	private double price;
	
	public HoaDonCafe(String name, double weight, double price) {
		this.name = name;
		this.weight = weight;
		this.price = price;
	}
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double SumOfPrice() {
		return this.price * this.weight;
	}
	
	public double GiamGia(double x) {
		return SumOfPrice() - x * SumOfPrice() / 100;
	}

	@Override
	public String toString() {
		return "HoaDonCafe [name=" + name + ", weight=" + weight + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price, weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HoaDonCafe other = (HoaDonCafe) obj;
		return Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}
	
	
	
}
