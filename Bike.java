package Oops;

public class Bike {
	private int price;
	private String brand;
	private String colour;
	private int cc;
	
	private boolean isElectric;
	public void setprice(int price) {
		this.price=price;
	}
	public int getprice() {
		return price;
	}
	public void setbrand(String brand) {
		this.brand=brand;
	}
	public String getbrand() {
		return brand;
	}
	public void setcolour(String colour) {
		this.colour=colour;
	}
	public String getcolour() {
		return colour;
	}
	public void setcc(int cc) {
		this.cc=cc;
	}
	public int getcc() {
		return cc;
	}
	public void setisElectric(boolean isElectric) {
		this.isElectric=isElectric;
	}
	public boolean getisElectric() {
		return isElectric;
	}
	public Bike(int price,String brand,String colour,int cc,boolean isElectric) {
		this.price=price;
		this.brand=brand;
		this.colour=colour;
		this.cc=cc;
		this.isElectric=isElectric;
	}
	public String toString() {
		return "Price="+this.price+"Brand="+this.brand+"colour="+this.colour+"CC="+this.cc+"IsElectric="+this.isElectric;
	}

}
