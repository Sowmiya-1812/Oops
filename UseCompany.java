package Oops;

public class UseCompany {
	public static void main(String[] args) {
	Employee emp1 = new Employee("Sridevi",3450,9698574795l,true);
	Employee emp2 = new Employee("Kayal",5678,6374144616l,false);
	Employee emp3 = new Employee("Ishu",7894,7373528557l,true);
	Company comp1 = new Company("TCS","Trichy",5000,emp1,true);
    Company comp2 = new Company("HCL","Chennai",40000,emp2,true);
    Company comp3 = new Company("Reliance","Banglore",20000,emp3,false);
    System.out.println(comp1);
    System.out.println(comp2);
    System.out.println(comp3);
    
	}
	
}
