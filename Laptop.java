package Oops;

public class Laptop {
	private int price;
	private String brand;
	private String colour;
	private int ram;
	private Processor processor;
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getColour() {
		return colour;
	}
	public void setRam(int ram) {
		this.ram=ram;
	}
	public int getRam() {
		return ram;
	}
	public Laptop(int price,String brand,String colour,int ram,Processor processor) {
		this.price=price;
		this.brand=brand;
		this.colour=colour;
		this.ram=ram;
		this.processor=processor;
	}
	public String toString() {
		return "Price= "+price+","+"Brand= "+brand+","+"Colour= "+colour+","+"Ram= "+ram+","+"Processor= "+processor;
	}

}
