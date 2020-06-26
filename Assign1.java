/* Practice Example 1: Checking Pass or Fail With Conditionals
Practice example 1: If else / pass or fail



Prompt the user to enter his marks in the range of 0-100.

Accept the marks obtained by the user.

Compare the marks obtained using a conditional.

If marks obtained >=35, print a message “You passed”.

If marks obtained <35, print a message “You Failed”. 

*/ 

import java.util.Scanner;

public class Assign1 {

	public static void main(String[] args) {
		System.out.println("Enter marks in range 0-100");
		Scanner sc = new Scanner(System.in);
		
		int marks = sc.nextInt();
		
		if (marks >=35) {
			System.out.println("you passed");
			
		}
		else {
			System.out.println("You failed");
		}
		sc.close();
	}

}
