/* Practice example 3: Switch case, Day of the week

Write a program to accept the day of the week from the user and display the name of the day accordingly.

For example, if the user enters the day number as 1, the user should get a message as Monday.

Use a switch case to implement the solution. */

import java.util.Scanner;

public class Assign3 {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		boolean exit;

	do {
		System.out.println("Enter day number of a week");
		num = sc.nextInt();
		exit = false;
		
		switch(num) {
		case 1: System.out.println("Monday");
			break;
		case 2: System.out.println("Tuesday");
			break;
		case 3: System.out.println("Webnesday");
			break;
		case 4: System.out.println("Thusday");
			break;
		case 5: System.out.println("Friday");
			break;
		case 6: System.out.println("Saturday");
			break;
		case 7: System.out.println("Sunday");
			break;
		default: System.out.println("Enter number between 1-7");
				exit = true;
			break;
		
		}
	  }while(exit);
	
	sc.close();}

}
