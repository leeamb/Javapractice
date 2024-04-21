package javasession;

import java.util.Arrays;

public class ForEachLoop {

	public static void main(String[] args) {
	/*	int i[] = {10,20,30,40,10,1};
		
		// index based loop
		for (int k =0; k<=i.length-1; k++) {
			System.out.println(i[k]);
		}
		
		//For each loop:
		for(int e : i) {
			System.out.println(e);
		}
		
		//output with index e.e 0-10 1-20 etc.
		int count =0;
		for(int e : i) {
			System.out.println(count + "-" + e);
			count++;
		}
		
System.out.println("--------------------------------------------------");

		//reverse order
		int rCount = 5;
		for(int e : i) {
			e = rCount;
			System.out.println(rCount + "-" + i[e]);
			rCount--;
		}
		
		
System.out.println("--------------------------------------------------");

		double d[] = {1.1 , 2.2, 3.4, 9.8};
		for (double e : d) {
			System.out.println(e);
		}
		
		String s[] = {"Leena", "Amol", "Ambekar"};
		for (String e : s) {
			System.out.println(e);
		}
		
		Object data[] = {"Leena", 40, 75.50, 'F', true};
		for (Object e : data) {
			System.out.println(e);
			
		}
		System.out.println(Arrays.toString(data));*/
		
		char ch[] = {'a','b', 'c','d','e'};
		for(char e: ch) {
			int asciiVal = (int) e;
			System.out.println(e + "-"+ asciiVal);
		}
		
		char num[] = {'0','1','2','3','4','5','6','7','8','9'};
		for (char element : num) {
			int asciVal = (int)element;
			System.out.println(element + "-"+ asciVal);
		}
		
		
		
		
	}
	
		

}
