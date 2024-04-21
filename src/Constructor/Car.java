package Constructor;

public class Car {
	String make;
	String model;
	int year;
	
	public Car() {
		this.make = "Unknown";
		this.model ="Unknown";
		this.year = 0;
		
	}
	public Car(String make,String model,int year ) {
		this.make = make;
		this.model = model;
		this.year = year;
		
	}

	public static void main(String[] args) {
		
		Car c1 = new Car();
		System.out.println("Car make is :" + c1.make);
		System.out.println("Car model is :" + c1.model);
		System.out.println("Car year is :" + c1.year);
		
		Car c2 = new Car("BMW", "Q5", 2024);
		System.out.println("Car make is :" + c2.make);
		System.out.println("Car model is :" + c2.model);
		System.out.println("Car year is :" + c2.year);

	}

}
