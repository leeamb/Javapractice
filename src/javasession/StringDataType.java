package javasession;

public class StringDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		String s = "Hello World!";
		String x = "Hello";
		String y = "Selenium";
		
		int a = 100;
		int b = 200;
		
		System.out.println(a+b);// addition of two numbers
		System.out.println(x+y);// concatenation of two strings
		System.out.println(x+a);// concatenation of string and number -> Hello100
		System.out.println(a+b+x+y);// 300HelloSelenium
		System.out.println(x+y+a+b); //HelloSelenium100200
		System.out.println(a+b+x+y+a+b);//300HelloSelenium100200
		
		System.out.println(x+y+a+b+x+y);//HelloSelemium100200HelloSelenium
		System.out.println(x+y+a+b);//HelloSelemium100200
		System.out.println(x+y+(a+b));//HelloSelenium300
		
//// double ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		double d1 = 12.33;
		double d2 = 23.44;
		System.out.println(x+y+d1+d2);//HelloSelenium12.3323.44
		System.out.println(x+y+(d1+d2));// HelloSelenium35.77
		System.out.println(a+b+d1+d2+x+y+a+b);//335.77HelloSelenium100200
		
///// char ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		char c = 'a';
		String t = "Hello";
		System.out.println(t+c+'b');//Helloab
		System.out.println('a'+'b'+t);//195Hello - first addition of ASCII value of two chars then concatenation with string
		System.out.println('a'+'b'+100+t);//295Hello
		System.out.println('b'+100);//198
		
///// int //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		int p =100;
		int q = 200;
		System.out.println("the value of p is " + p);// the value of p is 100
		System.out.println("the value of q is " + q);//the value of p is 200
		System.out.println("the value of sum of p and q is " + p+q);// the value of sum of p and q is 100200
		System.out.println("the sum of p and q is " + (p+q));// the sum of p and q is 300
		

	}

}
