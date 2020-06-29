
/* Practice example 10:exception handling

Invalid user id exception



Write a program to accept a user_id value from the user.

If the user_id entered by the user is not equal to “1234”, the program should throw an InvalidUserIdException.

InvalidUserIdException is a custom created exception which will be created by us.

The InvalidUserIdException should return an exception message which says: Invalid user id entered */

import java.util.Scanner;

class InvalidUserIdException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5516102559336961635L;

	@Override
	public String toString() {
		return ("Invalid user id entered");
	}
}



public class Assign10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int user_id ;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a ID: ");
		user_id = sc.nextInt();
		try {
			if (user_id != 1234) {
				throw new InvalidUserIdException();
			}
		}
		catch (InvalidUserIdException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		finally {
			sc.close();
		}
		
		
	}

}
