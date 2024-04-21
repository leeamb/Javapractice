package javasession;

public class MethodOverloading {
	//Method overloading -> polymorphism
	
	public void search(int a) {
		
	}
	
public void search(int price, String color) {
		
	}

public void search(int price, String color, String name) {
	
}

	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		obj.search(10); ///call by value
		

	}

}
