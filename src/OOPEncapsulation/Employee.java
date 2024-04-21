package OOPEncapsulation;

public class Employee {
	public String name;
	private int age;
	private double salary;
	private boolean isActive;
	
	public String dob;
	
	/* we can not call private constructor from out side the class. so can not create an object for private constructor.
	 * private Employee() {
	 * 
	 * }
	 */
	//setter
	public Employee(String name,int age,double salary,boolean isActive) {
		this.name= name;
		this.age = age;
		this.salary = salary;
		this.isActive =isActive;
	}
	//setter
	public Employee(String name,int age) {
		this.name= name;
		this.age = age;
	}
	
	/*within class public an d private variable are accessible.
	 * public static void main(String[] args) {
	 * 
	 * Employee e1 = new Employee(); e1.name = "Leena"; e1.age =30; e1.salary =
	 * 12.33; }
	 */
	
	//public getter and setter methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
	

}
