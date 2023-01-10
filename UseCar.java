package Oops;

public class UseCar {
	public static void main(String[] args) {
		Engine eng = new Engine();
		eng.noOfPistons = 4;
		eng.price = 50000;
		eng.fuel = "Diesel";
		Car car1 = new Car();
		car1.brand = "Bmw";
		car1.colour = "Black";
		car1.price = 5000000;
		car1.engine = eng;
		System.out.println(car1.brand+" "+car1.price+" "+car1.colour+" "+car1.engine.noOfPistons+" "+car1.engine.price+" "+car1.engine.fuel);
	
	Engine eng1 = new Engine();   
	eng1.noOfPistons = 6;
	eng1.price = 600000;
	eng1.fuel = "Petrol";
	Car car2 = new Car();
	car2.brand = "Audi";
	car2.colour = "White";
	car2.price = 7000000;
	car2.engine = eng1;
	System.out.println("Brand= "+car2.brand+" "+"Price= "+car2.price+" "+"Colour= "+car2.colour+" "+"NoofPistons= "+car2.engine.noOfPistons+" "+"Price= "+car2.engine.price+"Fuel= "+car2.engine.fuel);
	}


}
