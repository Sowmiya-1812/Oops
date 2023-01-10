package Oops;

public class UseBike {
	public static void main(String[] args) {
		Bike bike1 = new Bike(500000,"Hero","Pink",120,true);
		Bike bike2 = new Bike(45000,"Honda","red",220,false);
		Bike bike3 = new Bike(50000,"Duke","blue",200,false);
		Bike bike4 = new Bike(600000,"R15","yellow",100,true);
		Bike[] bikes = {bike1,bike2,bike3,bike4};
		Bike max =bikes[0];
		for(int i=0; i<bikes.length; i++) {
			if(bikes[i].getprice()>=max.getprice()) {
				max=bikes[i];
				
			}
		}
		System.out.println(max);
		
		
	}

}
