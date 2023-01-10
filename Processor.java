package Oops;

public class Processor {
	private String brand;
	private int price;
	private int generation;
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public void setGeneration(int generation) {
		this.generation=generation;
	}
	public int getGeneration() {
		return generation;
	}
	public Processor(String brand,int price,int generation) {
		this.brand=brand;
		this.price=price;
		this.generation=generation;
	}
	public String toString() {
		return "Brand= "+brand+","+"Price= "+price+","+"Generation= "+generation;
	}
	

}
