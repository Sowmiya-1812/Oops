package Oops;

public class Pen {
	private String brand;
	private int price;
	private String colour;
	private boolean isRefillable;
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setPrice(int price ) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getColour() {
		return colour;
	}
	public void setIsRefillable(boolean isRefillable) {
		this.isRefillable = isRefillable;
	}
	public boolean getIsRefillable() {
		return isRefillable;
	}
	

}
