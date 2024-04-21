package Constructor;

public class Employee {
	// class or globle variables
	String name;
	int age;
	double salary;
	boolean isActive;
	char gender;
	
	//Constructor 
	//no return type (not even void
	// name of constructor is same as class name
	// 0 parameter - default constructor
	// can overload
	
	// use of constructor-- to initializing class variables with constructor ... local variables using "this" keyword
	//to restrict object creation- depends on business logic
	// to initialization purpose only not business logic.
	//classes and constructor will be loaded by class loader in Auxillary place.
	
	// Diff in func and Constructor --- function has business logic. it returns value (no return then uses void)
	
	public Employee() {
		System.out.println("in default constructor");	
	}
	
	public Employee(int age) {
		System.out.println(age);	
	}

	public Employee(String name,int age) {
		//System.out.println(i+s);	
		this.name= name;
		this.age = age;

	}
	public Employee(String name,int age,double salary) {
		//System.out.println(i+s);	
		this.name= name;
		this.age = age;
		this.salary = salary;

	}
	public Employee(String name,int age,double salary, boolean isActive) {
		//System.out.println(i+s);	
		this.name= name;
		this.age = age;
		this.salary = salary;
		this.isActive = isActive;

	}
	public Employee(String name,int age,double salary, boolean isActive,char gender) {
		//System.out.println(i+s);	
		this.name= name;
		this.age = age;
		this.salary = salary;
		this.isActive = isActive;
		this.gender = gender;

	}
	
	public static void main(String[] args) {
		/*
		 * Employee e1 = new Employee(); e1.name = "Tom";
		 * 
		 * Employee e2 = new Employee(); e2.name = "Yash"; e2.salary= 12.33;
		 * 
		 * Employee e3 = new Employee(); e3.name = "CAt"; e3.salary= 10.33; e3.age = 30;
		 * 
		 * Employee e4 = new Employee(); e4.name = "Jyo"; e4.salary= 10.33; e4.age = 30;
		 */
		Employee e1 = new Employee("Leena",10);
		
	}

}
