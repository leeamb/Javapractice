package javasession;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListConcept {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		System.out.println(ar.size());//0 : interview question: default virtual capacity is 10. .size() gives physical capacity
		// after filling 10 virtual segments , if we add new value in arraylist , java will add 5 (current PC/2)more virtual sements.
		//It is called Load factor
		//VC- virtual capacity
		//PC- Physical capacity
		
		ar.add(100);
		ar.add(200);
		System.out.println(ar.size());
		
		ar.add(300);
		ar.add(400);
		System.out.println(ar.size());
		
		ar.add(500);
		ar.add(600);
		System.out.println(ar.size());
		System.out.println(ar);
		
		ar.remove(5);
		System.out.println(ar.size());
		System.out.println(ar);
		
		// initialization of ArrayList
		  ArrayList<String> arrLst = new ArrayList<String>(Arrays.asList("One","Two","Three"));
		  ArrayList<Integer> arrInt = new ArrayList<Integer>()
		  {{
			  add(1);
			  add(2);
			  add(3);
		  }};
		  

	}

}
