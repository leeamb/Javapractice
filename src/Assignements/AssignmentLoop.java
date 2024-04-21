package Assignements;

public class AssignmentLoop {

	public static void main(String[] args) {
		/*1. WAP to print following output:
			I am Batman﻿
			I am Batman﻿
			I am Batman﻿
			I am Batman
			I am Batman
		
		for (byte i=1; i<6; i++) {
			System.out.println("I am Batman");
		}
*/
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			/*2. WAP to print following output:
			I am Batman 1
			I am Batman 2
			I am Batman 3
			I am Batman 4
			I am Batman 5
			I am Batman 6
			I am Batman 7
			I am Batman 8
			I am Batman 9
		for (byte i=1; i<10; i++) {
			System.out.println("I am Batman "+ i);
		}*/

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
			//3. WAP to print 10 to 1 using for, while and do-while loop
			/*
			 * int i = 10; while (i>0) { System.out.println(i); i--; }
			 * 
			 * do { System.out.println(i); i--; }while (i>1);
			 */
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
			//4. Write a program in Java to print "Hello World" ten times using while loop
			/*
			 * byte i =10; while (i>0) { System.out.println("Hello world"); i--; }
			 */		
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
			//5. Write a program in Java to print all the multiplication of 5 from 1 to 100 using while /for/do-while loop
		/*int i = 1;
		 * while (i<=100) { if (i % 5 == 0) { System.out.println(i); } i++; }
		
		do {
			if (i % 5 == 0) {
				System.out.println(i); 
				} 
			i++;
		}while(i<=100); 
		
		for (int i=1; i<=100; i++) {
			if (i % 5 == 0) {
				System.out.println(i); 
				}
		}*/
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
			//6. Print all odd and even numbers between 1 to 100
			/*
			 * for (int i = 1; i<=100; i++) { if (i % 2 == 0) {
			 * System.out.println("Even numer:"+ i); } else {
			 * System.out.println("Odd numer:"+ i); } }
			 */
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
			//7. What will be the output of this program:
			/*
			 * int i = 1; while(i<=1){ System.out.println("Hi Java"); } // infinite loop
			 * (need to change value of i by i++ / i--)
			 */		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
			//8. Print A-Z , a-z, 0-9 with  the respective ASCII numbers the console one using while and for loop.
			/*
			 * char ch = '0'; while(ch <= '9') { System.out.println(ch + " - "+(int)ch);
			 * ch++; } for(char c = 'A'; c<= 'Z'; c++) { System.out.println(c +
			 * " - "+(int)c); }
			 */
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
			/*9. Print the following series: 
					1.0 2.0 3.0  ...... 10.0 

			0 9 18 27 36 …99*/
			/*
			 * for (float b = 1.0f; b<=10.0; b++) { System.out.print(b + " ");
			 * }System.out.println();
			 * 
			 * for (byte c = 0; c<=100; c++) { if(c %9 ==0) { System.out.print(c+ " "); } }
			 */
////////////////////////////////////////////////////////////
		
			//Print only vowels (aeiou) using for and while loop. Start the loop from ‘a‘ to ‘z‘.
			/*
			 * for(char ch = 'a'; ch <= 'z'; ch ++) { if (ch =='a' |ch =='e'|ch =='i'|ch
			 * =='o'|ch =='u') { System.out.println(ch); } }
			 */
			/*
			 * char p = 'a'; while(p <='z') {
			 * 
			 * if (p =='a' | p =='e'| p =='i'|p =='o'|p =='u') { System.out.println(p);
			 * 
			 * }p++; }
			 */
////////////////////////////////////////////////////////////

			
			  //Print 1 to 10 and break the loop once you find the multiplication of 7 with a message "bye, see you tomorrow".
				/*
				 * int x = 1; while(x<=10){ System.out.println(x); if(x % 7 == 0){
				 * System.out.println("bye, see you tomorrow"); break; }x++; }
				 */
	/*	int i = 2000;
		System.out.println((char)i); We can type cast int to char*/
		
////////////////////////////////////////////////////////////


	}

}
