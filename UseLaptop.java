package Oops;

public class UseLaptop {
	public static void main(String[] args) {
    Processor processor=new Processor("Lenevo",45000,1);
	Laptop lap1= new Laptop(250000,"Dell","White",12,processor);
	Laptop lap2= new Laptop(50000,"Itel","black",6,processor);
	Laptop lap3= new Laptop(20000,"Radeon","pink",8,processor);
	System.out.println(lap1);
	System.out.println(lap2);
	System.out.println(lap3);
	
	}
}
