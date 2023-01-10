package Oops;

public class Employee {
	private String name;
	private int id;
	private long mobileNumber;
	private boolean isPermanent;
	public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
	public void setid(int id) {
		this.id=id;
	}
	public int getid() {
		return id;
	}
	public void setmobileNumber(long mobileNumber) {
		this.mobileNumber=mobileNumber;
	}
	public long getmobileNumber() {
		return mobileNumber;
	}
	public void setisPermanent(boolean isPermanent) {
		this.isPermanent=isPermanent;
	}
	public boolean getisPermanent() {
		return isPermanent;
	}
	public Employee(String name,int id,long mobileNumber,boolean isPermanent) {
		this.name=name;
		this.id=id;
		this.mobileNumber=mobileNumber;
		this.isPermanent=isPermanent;
	}
	public String toString() {
		return "Name= "+this.name+","+"ID= "+this.id+","+"MobileNumber= "+this.mobileNumber+","+"Is Permanent= "+this.isPermanent;
	}

}
