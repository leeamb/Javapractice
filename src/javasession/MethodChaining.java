package javasession;

public class MethodChaining {
	/*
	 * public static void test() {
	 * 
	 * } public static void test(int a) {
	 * 
	 * } public static void test(int a, String b) {
	 * 
	 * }
	 */
	// static - static --> classname.method or name directly
	// Non Static  - Non Static  --> directly
	// static - non static --> create the object
	// Non static - static --> classname.method or name directly
	
	//Main - Static --> classname.method or name directly
	//Main - Non static  --> create the object
			
	public static void t1() {
		System.out.println("t1 method");
		t2();
	}

	public static void t2() {
		System.out.println("t2 method");
		t3();
	}

	public static void t3() {
		System.out.println("t3 method");
	//	m1(); Error- non static method can not be called in the static method directly
		MethodChaining obj1 = new MethodChaining();
		obj1.m1();
	}

	public void m1() {
		System.out.println("m1 method");
		m2();
	}
	
	public void m2() {
		System.out.println("m2 method");
		m3();
	}
	public void m3() {
		System.out.println("m3 method");
		t1(); //Non static method can call static methods directly
	}
	
	public static void main(String[] args) {
		MethodChaining.t1();
		MethodChaining obj = new MethodChaining();
		obj.m1();


	}
	
	

}
