package Assignements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AssignmentArrayList {

	
	public static void main(String[] args) {
		/*
		 * 1. Write a Java program to create a new array list, which contains all color
		 * names. --add some colors (string) ---and print out the colorslist using
		 * loops.
		 */	
		/*
		 * ArrayList<String> colors = new ArrayList<String>(); colors.add("Red");
		 * colors.add("Yellow"); colors.add("Pink"); colors.add("Purple"); for (int i=0;
		 * i< colors.size(); i++) { System.out.println(colors.get(i));
		 * }System.out.println(colors); for(String e : colors){ System.out.println(e); }
		 */
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		
		// Write a Java program to retrieve an element at a specified index from a given array list.
		/*
		 * ArrayList<Integer> arrLst = new ArrayList<Integer>(); arrLst.add(12);
		 * arrLst.add(34); arrLst.add(54); arrLst.add(234); arrLst.add(786);
		 * System.out.println(arrLst.get(3));
		 */
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		
		//3. Write a Java program to update specific array element by given element.
		/*
		 * ArrayList<String> arr = new ArrayList<String>(); arr.add("Leena");
		 * arr.add("Bhavsar"); System.out.println(arr); arr.set(1, "Ambekar");
		 * System.out.println(arr);
		 */
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		
		//4. Write a Java program to remove the third element from an array list. 
		/*
		 * ArrayList<String> arr = new ArrayList<String>(); arr.add("Leena");
		 * arr.add("Ambekar"); arr.add("Amol"); System.out.println(arr);
		 * 
		 * arr.remove(2); System.out.println(arr);
		 */

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		
		//5. Write a Java program to search an element in an array list using for loop. Once we find that element, break the loop.
		
		 /* ArrayList<Object> arr = new ArrayList<Object>(); arr.add(10); arr.add(20);
		  arr.add(50); arr.add(678); arr.add(1000); arr.add(98.34);
		  
		  for(int i = 0; i<arr.size(); i++) { if(arr.get(i).equals(98.34) ) // In object array to compare two values .equals method is used.
		  {
		  System.out.println("98.34 is present in array"); break; }
		  System.out.println(arr.get(i)); }System.out.println("out of Loop");*/
		 

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////			
			
		 /* 6.Reverse this array List: ArrayList<String> studentNames = new
		 * ArrayList<String>(); studentNames.add("Varun"); studentNames.add("Reena");
		 * studentNames.add("Naveen"); studentNames.add("Robin");
		 * studentNames.add("Peter");
		 */
			/*
			 * ArrayList<String> studentNames = new ArrayList<String>();
			 * studentNames.add("Varun"); studentNames.add("Reena");
			 * studentNames.add("Naveen"); studentNames.add("Robin");
			 * studentNames.add("Peter");
			 * 
			 * Collections.reverse(studentNames); System.out.println(studentNames);
			 */

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		
		//7. Write a Java program to extract a portion of an array list.
		/*
		 * ArrayList<String> studentNames = new ArrayList<String>();
		 * studentNames.add("Varun"); studentNames.add("Reena");
		 * studentNames.add("Naveen"); studentNames.add("Robin");
		 * studentNames.add("Peter");
		 * 
		 * System.out.println(studentNames);
		 * 
		 * ArrayList<String> portion = new ArrayList<String>(studentNames.subList(1,4));
		 * System.out.println(portion);
		 */

		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		
		//8. Write a Java program to empty an array list.
	
		/*
		 * ArrayList<String> studentNames = new ArrayList<String>();
		 * studentNames.add("Varun"); studentNames.add("Reena");
		 * studentNames.add("Naveen"); studentNames.add("Robin");
		 * studentNames.add("Peter");
		 * 
		 * System.out.println(studentNames); studentNames.clear();
		 * System.out.println(studentNames); if(studentNames.isEmpty()) {
		 * System.out.println("The array is Empty"); }
		 */
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		
		//9. Write a Java program to trim the virtual capacity of an array list to the current list size.
		
		/*  ArrayList<String> studentNames = new ArrayList<String>(10);
		  System.out.println(studentNames.size()); studentNames.add("Varun");
		  studentNames.add("Reena"); studentNames.add("Naveen");
		  studentNames.add("Robin"); studentNames.add("Peter");
		  System.out.println(studentNames.size()); 
		  studentNames.trimToSize();                                         //??????????
		  System.out.println(studentNames.size());*/
		 		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		
		//10. Write a Java program to print all the elements of an ArrayList using the position of the elements.
		/*
		 * ArrayList<String> colors = new ArrayList<>(); colors.add("Red");
		 * colors.add("Green"); colors.add("Blue"); colors.add("Yellow");
		 * 
		 * for (int i =0 ; i< colors.size(); i++) {
		 * 
		 * System.out.println("The element at the index "+ i+ " is : "+ colors.get(i));
		 * }
		 */
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		
		
		  
		  }

}
