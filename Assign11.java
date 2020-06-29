import java.util.Scanner;

/*
 * Practice example 11: Banking system, negative not allowed exception.



Write a java program that accepts a certain amount and deposits in your bank account.

It accepts the amount you want to deposit and then adds it to the current balance.

The challenge though is that if a user enters a negative amount i.e -200 it means that even though the user has deposited the amount, -200 will deduct the amount from the main balance.

To prevent the user from entering a negative value, we will create a NegativeNotAllowed exception.



Steps:

Accept the deposit amount from the user.

Check if the accepted amount is not negative.

If negative then throw a NegativeNotAllowed exception.

If positive, add it to the current+balance.


 */

class NegativeNotAllowed extends Exception {
	 /**
	 * 
	 */
	private static final long serialVersionUID = -9109177467396310042L;

	@Override
	 public String toString()
	 {
		 return ("No Negative Values");
	 }
}


public class Assign11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int deposit ;
		int balance = 10000 ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Deposit amount");
		deposit =sc.nextInt();
		
		
		try {
			if (deposit < 0) {
				throw new NegativeNotAllowed();
			}
			else {
				balance += deposit; 
			}
		}
		catch (NegativeNotAllowed e) {
			// TODO: handle exception
			System.out.println(e);
		}
		finally {
			sc.close();
			System.out.println("Current balance is = "+ balance);
		}
		
	}

}
