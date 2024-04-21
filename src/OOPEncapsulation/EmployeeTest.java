package OOPEncapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		
		//Employee e1 = new Employee();// private constructor can not be called from other classes.
		//e1.name = "Leena"; // out side of the class , private members are not accessible.
		
		Employee e1 = new Employee("Leena", 34, 99.99, true);// constructor is also setting the values.
		
		
		System.out.println(e1.getName()+ " "+e1.getAge()+" "+e1.getSalary()+" "+e1.isActive() );

		// update the information.
		e1.setName("Preksha");
		e1.setAge(30);
		e1.setSalary(234.3);
		e1.setActive(true);
		e1.dob= "01-01-2000";
		
		System.out.println(e1.getName()+ " "+e1.getAge()+" "+e1.getSalary()+" "+e1.isActive() );
		
		Employee e2 = new Employee("Shiva", 20);
		System.out.println(e2.getName()+ " "+e2.getAge()+" "+e2.getSalary()+" "+e2.isActive() );
		e2.setSalary(234.23);
		e2.setActive(true);
		System.out.println(e2.getName()+ " "+e2.getAge()+" "+e2.getSalary()+" "+e2.isActive() );
		
		Browser br = new Browser();
		br.launchBrowser();
	}

}
