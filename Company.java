package Oops;

public class Company {
	private String name;
	private String location;
	private int noOfEmployees;
	private Employee employee;
	private boolean isPrivate;
	public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
	public void setlocation(String location) {
		this.location=location;
	}
	public String getlocation() {
		return location;
	}
	public void setnoOfEmployees(int noOfEmployees) {
		this.noOfEmployees=noOfEmployees;
	}
	public int getnoOfEmployees() {
		return noOfEmployees;
	}
	public void setemployee(Employee employee) {
		this.employee=employee;
	}
	public Employee getemployee() {
		return employee;
	}
	public void setisPrivate(boolean isPrivate) {
		this.isPrivate=isPrivate;
	}
	public boolean getisPrivate() {
		return isPrivate;
	}
	public Company(String name,String location,int noOfEmployees,Employee employee,boolean isPrivate) {
		this.name=name;
		this.location=location;
		this.noOfEmployees=noOfEmployees;
		this.employee=employee;
		this.isPrivate=isPrivate;
	}
	public String toString() {
		return "Name= "+this.name+","+"Location= "+this.location+","+"NoOfEmployees= "+this.noOfEmployees+"Employee= "+this.employee+","+"Is Private= "+this.isPrivate;
		
	}

}
