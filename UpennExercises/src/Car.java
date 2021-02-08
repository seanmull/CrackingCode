

import java.util.Calendar;
//page 64
public class Car {
	//instance variables
	String make = "VW";
	String model;
	int year = 2020;
	boolean isNew = true;
	double miles; //miles the car travels
	String owner;

	public void sell(String newOwner) {
		owner = newOwner;
		if (isNew) {
			isNew = false;
		}
	}
	public boolean isOld() {
		int thisYear = Calendar.getInstance().get(Calendar.YEAR);
		if (thisYear - year > 10) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		Car myCar = new Car();
		//myCar.sell("Sean");
		//System.out.println(myCar.make);
		//System.out.println(myCar.isNew);		
		System.out.println(myCar.isOld());
	}

}
