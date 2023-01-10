package Oops;

public class Dress {
	String colour;
	int price;
	String material;
	int size;
	boolean isBranded;
	public Dress(String colour,int price,String material,int size,boolean isBranded) {
		this.colour=colour;
		this.price =price;
		this.material=material;
		this.size=size;
		this.isBranded=isBranded;
	}
	public String toString() {
		return "Colour= "+colour+","+"Price= "+price+","+"Material= "+material+","+"Size= "+size+","+"IsBranded= "+isBranded;
		
	}

}8