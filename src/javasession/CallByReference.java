package javasession;

public class CallByReference {
	
	String name;
	int age;
	
	public static void getInfo(CallByReference t1) {
		//CallByReference obj1 = new CallByReference();
		//System.out.println(obj1.name);
		
		System.out.println(t1.name);
		System.out.println(t1.age);
		
		t1.name= "Tom";
		t1.age = 35;
		
		System.out.println(t1.name);
		System.out.println(t1.age);
		
	}
	

	public static void main(String[] args) {
		CallByReference obj = new CallByReference();
		obj.name ="Leena";
		obj.age = 30;
		
		getInfo(obj);// call by reference
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		
//		CallByReference app = new CallByReference();
//		getInfo(app);// it shows default values name = null and age = 0
	}

}
