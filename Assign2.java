/*Practice example 2: Nested if ()

Criteria to play football at an academy is that age should be greater than 16 and height should be greater than 167 cm.

Write a program which does the following:

Accept the user's age.

Accept user’s height in cm.

If age is greater than 16 and height is greater than 167, display a message “You are qualified to play”.

If age is greater than 16 but height is <167, display a message that “You are not qualified to play”

If age is less than 16 and height is >167 or<167 then display a message that says “You are not qualified as of now, come back after X years” Where X is the difference between 16 and user’s current age.*/

import java.util.Scanner;

public class Assign2 {

	public static void main(String[] args) {
		int age;
		int height;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
		age = sc.nextInt();
		System.out.println();
		System.out.print("Enter you height: ");
		height = sc.nextInt();
		System.out.println();
		
		if(age > 16 )
		{	 if (height >=167) System.out.println("You are qualified");
		else if (height<167) System.out.println("You are not qualified");
		}
		else if (age < 16)
		{
			System.out.println("You are not qualified as of now, come back after "+(16-age) +" years");
		}

	sc.close();}

}
