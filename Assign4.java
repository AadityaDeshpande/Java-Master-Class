/* Practice example 4: For loop, multiplication tables.

Ask the user to enter a number for which he wants to get multiplication tables and then display a multiplication table for that number till the multiple of 10. */

import java.util.Scanner;

public class Assign4 {

	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		System.out.println("found "+ num);
		
	for(int i = 1 ; i < 11 ; i++) { 
		System.out.println(num * i);
	}
		
	sc.close();}
}
