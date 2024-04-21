package Assignements;

import java.util.Arrays;

public class AssignmentArray {

	public static void main(String[] args) {
		/*
		 * WAP to delete a specific number from the given array.
		 * int p[] = {1,4,5,2,3,22,31, 2};
		 * --Need to remove 22 from the p[] array.
		 * --output should be: [1, 4, 5, 2, 3, 31, 2]
		 */
		/*
		 * int p[] = {1,4,5,2,3,22,31, 2}; int a[] = new int[p.length-1]; int j = 0; for
		 * (int i = 0; i< p.length; i++) { if(p[i] != 22) { a[j] = p[i]; j++; } }
		 * System.out.println(Arrays.toString(a));
		 */
		
		/* =============================================================================
		 * Q2: Write a program to create a static Array, having following cricket data:
		 * --name, age, team name, DOB, gender, Strike Rate 
		 * --Try to create multiple Object Arrays for different players  
		 * --Try to print all the values of each player on the console
		 */
		
		/*
		 * Object player1[] = {"Leena",30,"MI","08091991",'F',12.33};
		 * System.out.println(Arrays.toString(player1)); Object player2[] =
		 * {"Sachin",32,"CSK","08091991",'M',12.33};
		 * System.out.println(Arrays.toString(player2)); Object player3[] =
		 * {"Akshat",34,"RR","08091991",'M',12.33};
		 * System.out.println(Arrays.toString(player3)); Object player4[] =
		 * {"Virat",20,"PK","08091991",'M',12.33};
		 * System.out.println(Arrays.toString(player4)); Object player5[] =
		 * {"John",25,"NR","08091991",'M',12.33};
		 * System.out.println(Arrays.toString(player5));
		 */
		
		/*
		 * for(int i = 1; i<6;i++) {
		 * 
		 * System.out.println(Arrays.toString(player+i)); }
		 */
		
		float i[] = new float[4];
		i[0]=1.2f;
		i[1]=3.4f;
		i[3]=6.7f;
		System.out.println(Arrays.toString(i));
		System.out.println(i[2]);
		
	}

}
