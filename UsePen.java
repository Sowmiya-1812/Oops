package Oops;

public class UsePen {
	public static void main(String[] args) {
		Pen pen1 = new Pen();
		pen1.setBrand("Carmel");
		pen1.setPrice(250);
		pen1.setColour("Red");
		pen1.setIsRefillable(true);
		//System.out.println(pen1.getBrand()+" "+pen1.getPrice()+" "+pen1.getColour()+" "+pen1.getIsRefillable());
		Pen pen2 = new Pen();
		pen2.setBrand("Hero");
		pen2.setPrice(500);
		pen2.setColour("Black");
		pen2.setIsRefillable(false);
		Pen pen3 = new Pen();
		pen3.setBrand("fair");
		pen3.setPrice(700);
		pen3.setColour("white");
		pen3.setIsRefillable(false);
		Pen[] pens = {pen1,pen2,pen3};
		int max = 0;
		for(int i=0; i<pens.length; i++) {
			if(pens[i].getPrice()>=max) {
				max = pens[i].getPrice();
				
			}
		}
		System.out.println(max);
		
		
	}

}
