package Assignements;

public class AssignmentDataType {
	
	public void set(long i) {
		System.out.println("Hi");
		System.out.println(i);
	}
	
	public void set(short i) {
		System.out.println("Hello");
		System.out.println(i);
	}
	public void set(int i) {
		System.out.println("How are you?");
		System.out.println(i);
	}

	public static void main(String[] args) {
		AssignmentDataType obj = new AssignmentDataType();
		obj.set(10);
	/*
		/*1. Write a Java program to add two strings:
		String a = “Hello“;
		String b = “Naveen K“
		Expected Output : Hello Naveen K
			
		String a = "Hello";
		String b = "Naveen k";
		System.out.println(a+ " " + b);
		
		
		 2. Write a Java program to print the sum of two numbers.
		 * Test Data:?.,74 + 36
		 * Expected Output:110
		 
		
		byte num1 = 74;
		byte num2 = 36;
		System.out.println(num1+num2);
		
		
		 *  Write a Java program to print the division of two numbers.
		 * k = 50/3
		 * Expected Output :
		 * 43
		 * 16 — correct one
		 * 19
		 * 13
		 
		byte num11 = 50;
		byte num22 = 3;
		System.out.println(num11/num22);
		
		
		 * 4. Write a Java program to compute the specified expressions and print the
		 * output. Go to the editor. Test Data: ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 -
		 * 4.5))  Expected Output : 2.138888888888889
		                         
		
		System.out.println((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
		
		//5. Try to concat "Hello Selenium" with a character 't'.
		char ch = 't';
		String s = "Hello Selenium";
		System.out.println(s+ch);
		
		
		//6. Create three int variables having values like : 100, 200, 3400. Add them and concatenate and generate this output String : 
		//"Your Total  amount is. 3700".
		int x = 100;
		int y = 200;
		int z = 3400;
		System.out.println("Your toatl amount is :"+ (x+y+z));
		
		//Print the ASCII value of the character 'h'.
		System.out.println((int)'h');
		
		//Write a program to add 3 to the ASCII value of the character 'd' and print the equivalent character.
		System.out.println((char)('d' +3));
		
		//Write a program to find the square of the number 3.9.
		System.out.println(3.9 * 3.9);
		
		//1) What will be the output of the following program?
		int i = 11;
		i = i++ + ++i; //24
		System.out.println("i: "+ i);
		
		int a1 =11 , b1 = 22, c1;
		c1 = a1 + b1 + a1++ + b1++ + ++a1 + ++b1;//103
		System.out.println("c1 : "+ c1);
		
		int j = 0;
		j = j++ - --j + ++j - j--;//0
		System.out.println("j: "+ j);
		
		int p=1, q=2, r=3;
		int m = p-- - q-- - r--;// 
		System.out.println("p="+p);//0

		System.out.println("q="+q);//1

		System.out.println("r="+ r);//2

		System.out.println("m="+m);//-4 
		
		int a=1, b=2;

		System.out.println(--b - ++a + ++b - --a);//0

		
		int i=19, j=29, k=0;
		int m = i-- - j-- - k--;// -10
		System.out.println("i="+i);//18
		System.out.println("j="+j);//28
		System.out.println("k="+k);//-1

		// What is wrong with the below program? Why it is showing compilation error?
		int i = 11;
		int j = --(i++);
	
		int m = 0, n = 0;
		int p = --m * --n * n-- * m--;
		System.out.println(p); //1
	
		int a = 1;
		a = a++ + ++a * --a - a--;
		System.out.println(a);//5


		int a = 11++;
		System.out.println(a);// error

		int ch = 'A';
		System.out.println(ch++);//65
		System.out.println(ch);
		System.out.println(++ch);
	
		
		double d = 1.5, D = 2.5;
		System.out.println(d++ + ++D);//5.0

		////////////////////// ----- If Else and Switch Case--------  ////////////////////
		/*Q1.a : Find out the greatest number out of three different given numbers:
			Input the 1st number: 25 
			Input the 2nd number: 78 
			Input the 3rd number: 87
			OutPut : 87 */
		/*	
			int num1 = 25;
			int num2 = 32;
			int num3 = 17;
					
			if (num1 > num2) {
				if (num1 >  num3) {
					System.out.println("The greatest : "+ num1);
				}				
				  else { System.out.println("The greatest : "+ num3); }
				 
			} else if (num2 > num3) {
				System.out.println(("The greatest : "+ num2));
	
			}else {
				System.out.println("The greatest : "+ num3);
			}
			
		
			///////////////// OR /////////////////
			 if (num1 >num2 && num1 > num3){
				 System.out.println("num1 is greatest: " + num1);
			 }else if (num2> num3) {
				 System.out.println("num2 is greatest: " + num2);
			 }else {
				 System.out.println("num3 is greatest: " + num3);
			 }
	*/
	/*
	 * 1.b : Find out the greatest number out of four different given numbers: Input
	 * the 1st number: 25  Input the 2nd number: 78  Input the 3rd number: 87 Input
	 * the 4th number: 97
	 * output = 97
		
		int num1 = 105;
		int num2 = 7800;
		int num3 = 673;
		int num4 = 817;
		//int grtnum1 = 0;
		//int grtnum2 = 0;
		
		if (num1 > num2 && num1> num3 && num1 > num4) {
			System.out.println(num1 + " is greatest number");
		} else if (num2>num1 && num2 > num3 && num2 > num4) {
			System.out.println(num2 + " is greatest number");
		}else if (num3>num1 && num3 > num2 && num3 > num4) {
			System.out.println(num3 + " is greatest number");
		}else {
			System.out.println(num4 + " is greatest number");
		}
	*/	
		
	/*
		if(num1 > num2) {
			grtnum1 = num1;
		}else {
			grtnum1 = num2;
		}
		if (num3 > num4) {
			grtnum2 = num3;
		} else {
			grtnum2 = num4;
		}
		
		if (grtnum1 > grtnum2) {
			System.out.println("The greatest : "+ grtnum1);
		}else  {
			System.out.println("The greatest : "+ grtnum2);
		}

	
		//2. Write a Java program to test a number is positive or negative.
		byte num = -11;
		
		if (num > 0) {
			System.out.println(num + " : Positive number");
		}else {
			System.out.println(num + " : Negative number");
		}
	*/
		
		//WAP to check number is odd or even using If - Else
		/*int num = 1234;
		
		if (num % 2 == 0 ) {
			System.out.println(num + " is an even number");
		}else {
			System.out.println(num + " is an odd number");
		}*/

		//WAP to check given alphabet character is Vowel or Consonant using Switch - Case
		/*char ch = 'U';
		
		switch(ch) {
		case 'a':
			System.out.println("This is vowel");
			break;
		case 'e':
			System.out.println("This is vowel");
			break;
		case 'i':
			System.out.println("This is vowel");
			break;
		case 'o':
			System.out.println("This is vowel");
			break;
		case 'u':
			System.out.println("This is vowel");
			break;
		case 'A':
			System.out.println("This is vowel");
			break;
		case 'E':
			System.out.println("This is vowel");
			break;
		case 'I':
			System.out.println("This is vowel");
			break;
		case 'O':
			System.out.println("This is vowel");
			break;
		case 'U':
			System.out.println("This is vowel");
			break;
		default:
			System.out.println("This is consonant");
			break;
		}*/

		//WAP to run your test cases in a specific environment like: QA, Stage, Dev, UAT, Prod using using Switch - Case
		/*String env = "UAT";
		
		switch (env) {
		case "QA":
			System.out.println("This is QA environment");
			break;
		case "Stage":
			System.out.println("This is Stage environment");
			break;
		case "Dev":
			System.out.println("This is Dev environment");
			break;
		case "UAT":
			System.out.println("This is UAT environment");
			break;
		case "Production":
			System.out.println("This is Production environment");
			break;
		}*/

		//WAP to book the specific type of car from the Uber app using Switch - Case. 
		// Car Type: Mini, Sedan, SUV, Premium
		// If user passes wrong car type, print please select the right car type
		/*String carType = "Mini";
		
		switch(carType) {
		case "Mini":
			System.out.println("Car type is Mini");
			break;
		case "Sedan":
			System.out.println("Car type is Sedan");
			break;
		case "SUV":
			System.out.println("Car type is SUV");
			break;
		case "Premium":
			System.out.println("Car type is Premium");
			break;
		default:
			System.out.println("please select the right car type");
			break;
		}*/

		//WAP to launch browsers using If-ElseIf and Switch Case.
		// Browser: Chrome/Firefox/IE/Safari
		// If user passes wrong browser, print please pass the right browser name
	/*	String browser = "SAFARI";
		if (browser.equalsIgnoreCase("safari")) {
			System.out.println("Browser is Safari");
		} else if (browser.equalsIgnoreCase("Chrome")) {
			System.out.println("Browser is Chrome");
		}else if (browser.equalsIgnoreCase("Firefox")) {
			System.out.println("Browser is Firefox");
		}else if (browser.equalsIgnoreCase("IE")) {
			System.out.println("Browser is IE");
		}else {
			System.out.println("please pass the right browser name");
		}
		
		switch(browser.toLowerCase()) {
		case "chrome":
			System.out.println("Browser is Chrome");
			break;
		case "safari":
			System.out.println("Browser is Safari");
			break;
		case "ie":
			System.out.println("Browser is IE");
			break;
		case "firefox":
			System.out.println("Browser is Firefox");
			break;
		default:
			System.out.println("please pass the right browser name");
			break;
	

		//WAP to define the interest rate on the basis of Loan type using Switch Case
		// Loan Type: Car Loan, Housing Loan, Personal Loan, Education Loan
		// For Housing Loan, if user’s salary is less than 35000 USD - print : NOT APPLICABLE FOR Housing Loan
		String loanType = "Housing Loan";
		int salary = 34999;
		
		switch(loanType.toLowerCase()){
		case "car loan":
			System.out.println("Loan type is Car");
			break;
		case "housing loan":
			System.out.println("Loan type is Housing");
			if (salary < 35000) {
				System.out.println("NOT APPLICABLE");
			}
			break;
		case "personal loan":
			System.out.println("Loan type is Personal");
			break;
		case "education loan":
			System.out.println("Loan type is educational");
			break;
		}
		
	}	*/
		
	/*
	 * char a ='n'; char b ='m'; System.out.println(a+b); System.out.println(a+" "
	 * +b);
	 */
	}	
		
	
	

}
