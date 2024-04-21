package Constructor;

public class Person {
	
	public String name ;
	public int age;
	public char gender;
	public double height;

	public Person(String name, int age, char gender, double height) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
		
	}
	
	public static void main(String[] args) {
		Person obj = new Person("Leena", 35, 'f', 5.3);
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.gender);
		System.out.println(obj.height);
		
		Person e2 = new Person("Akshat", 14, 'M',5.5) ;
		System.out.println(e2.name);
		System.out.println(e2.age);
		System.out.println(e2.gender);
		System.out.println(e2.height);
			
		
		
		
	}

}
