package Constructor;

public class Rectangle {
	double length;
	double height;
	
	Rectangle(){
		length = 0.0;
		height = 0.0;
	}
	
	public double calculateArea() // does not need parameters as variable values are initialized in constructors.
	{
		return(length * height);
	}
	
	Rectangle(double length, double height){
		this.length = length;
		this.height = height;
	}

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		System.out.println(r1.length);
		System.out.println(r1.height);
		System.out.println(r1.calculateArea());
		
		
		Rectangle r2 = new Rectangle(20.5, 12.5);
		System.out.println(r2.length);
		System.out.println(r2.height);
		System.out.println(r2.calculateArea());
	}

}
