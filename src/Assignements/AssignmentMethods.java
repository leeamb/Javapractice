package Assignements;

public class AssignmentMethods {
	int sum;
	int subtract;
	int multiply;
	int divid;
	static final double pie= 3.14;
	boolean result;
	int marks;
	String grade;
	
	/*
	 * 1.Write a program to print the addition/subtraction/division/multiplication
	 * of two numbers entered by user by defining your own method
	 */
	public int add (int a, int b) {
		sum = a+b;
		return sum;
	}
	public int sub (int a, int b) {
		subtract= a - b;
		return subtract;
	}
	public int mul (int a, int b) {
		multiply = a*b;
		return multiply;
	}
	public int div (int a, int b) {
		divid = a/b;
		return divid;
	}
	
	/* 2. Define a method that returns the product of two double numbers entered by
	 * user.
	 */
	public double mul (double a, double b) {
		double multiply = a*b;
		return multiply;
	}
	
	 /* 
	 * 3.Write a program to print the circumference and area of a circle of radius
	 * entered by user by defining your own method. 
	 */
	
	 public double circum(double r) {
		  double circ = 2* pie * r;
		 return circ;
	 }
	 
	 public double area(double r) {
		  double area = pie * r * r;
		 return area;
	 }
	
	    /* 4. Define two methods to print the maximum and the minimum number
		 * respectively among three numbers entered by user.
		 */
	 	public int max(int a, int b, int c) {
	 		if (a>b) {
	 			if (a>c) {
	 				return a;
	 			} 
	 		}else if (b > c){
		 			return b;
	 			}  
	 		return c;
	 	}
	 
	 	public int min(int a, int b, int c) {
	 		if (a<b) {
	 			if (a<c) {
	 				return a;
	 			} 
	 		}else if (b < c){
		 			return b;
	 			}  
	 		return c;
	 	}
	 
	 	 /* 
		 * 5. Def﻿ine a program to find out whether a given number is even or odd -
		 * return true/false.
		 */ 
	 	public boolean evenOdd(int a) {
	 		if (a%2 == 0) {
	 			result = true;
			} /*
				 * else { result = false; }
				 */
	 		return result;
	 	}
	 	
	 	
	 	 // 6. A person is eligible to vote if his/her age is greater than or equal to 18.
	 	/*  Define a method to find out if he/she is eligible to﻿ vote. - return
		 * true/false */
	 	public boolean votingAge(int a) {
	 		if (a >= 18) {
	 			result = true;
			} 
			 else { result = false; }
	 		 return result;
	 	}
	 	
	 	/* 7. Write a program which will ask the user to enter his/her marks (out of
		 * 100). Define a method that will display grades according to the marks entered
		 * as below:
		 * 
		 * Marks        Grade
		 * 91-100         AA
		 * 81-90          AB
		 * 71-80          BB﻿
		 * 61-70          BC 
		 * 51-60          CD
		 * 41-50          DD
		 * <=40          Fail*/
	 	
		public String grades(int marks) {

			if (marks >= 91 && marks <= 100) {
				grade = "AA";
			}else if (marks >= 81 && marks <= 90) {
				grade = "AB";
			}
			else if (marks >= 71 && marks <= 80) {
				grade = "BB";
			}
			else if (marks >= 61 && marks <= 70) {
				grade = "BC";
			}else if (marks >= 51 && marks <= 60) {
				grade = "CD";
			}
			else if (marks >= 41 && marks <= 50) {
				grade = "DD";
			}
			else  {
				grade = "FAIL";
			}

			return grade;

		}
		
		 /* ________________________________
		 * 
		 * 8. Write a program to print the factorial of a number by defining a method
		 * named 'Factorial'.
		 * Factorial of any number n is represented by n! and is equal to
		 * 1*2*3*....*(n-1)*n. E.g.-
		 * 4! = 1*2*3*4 = 24
		 * 3! = 3*2*1 = 6
		 * 2! = 2*1 = 2
		 * Also,
		 * 1! = 1
		 * 0! = 1
		 */
	 	
		public void  factorial(int num) {
			int fact =1;
			String strFact = num + "!";
			String str = "1";
			if (num != 0) {
				for(int i = 2; i<=num; i++) {
				 fact = i * fact;
				 str = str + "*" + i;
			}
				System.out.println(strFact + " = "+ str + " = "+ fact);
			} else {
				System.out.println("0! = 1");
			}
		}
		
		
	public static void main(String[] args) {
		AssignmentMethods obj = new AssignmentMethods();
		
		System.out.println(obj.add(23, 4));
		System.out.println(obj.sub(24,356));
		System.out.println(obj.mul(23,56));
		System.out.println(obj.div(785,21));
		
		System.out.println("---------------------------------------------");
		System.out.println("2) "+ obj.mul(23.65,5665));
		
		System.out.println("---------------------------------------------");
		System.out.println("3) circumference = "+ obj.circum(23.65));
		System.out.println("3) area = "+ obj.area(23.65));
		
		System.out.println("---------------------------------------------");
		System.out.println("4) max number = "+ obj.max(40,15,6));
		System.out.println("4) min number = "+ obj.min(40,150,60));
		 
		System.out.println("---------------------------------------------");
		System.out.println("5) number is even = "+ obj.evenOdd(40));
		
		System.out.println("---------------------------------------------");
		System.out.println("6) person is eligible to vote = "+ obj.votingAge(11));
		
		System.out.println("---------------------------------------------");
		System.out.println("7) Grade is = "+ obj.grades(78));
		
		System.out.println("---------------------------------------------");
		obj.factorial(23);
		
		

	}

}
