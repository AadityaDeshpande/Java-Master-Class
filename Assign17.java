
/*
 * Example 17: Access specifiers



Let’s assume we are building a banking software.

We want the bank to have all the privileges, i.e depositing amount, withdrawing amount & updating user accounts balance.



We also want customers to have access to those features as well, but limit certain features.

Example, the user should be able to deposit and withdraw an amount but he/she should not be able to update the balance.


 */

class Bank {
	
	void deposit()
	{
		System.out.println("Amount has been deposited");
	}
	
	void withdraw() 
	{
		System.out.println("Amount has been withdrawn");
	}
	
	private void update_balance() 
	{
		System.out.println("Balance has been updated");
	}
	
	void RunUpdateBalance()
	{
		update_balance();
	}
	
}

class Customer extends Bank {
	
}




public class Assign17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer custObj = new Customer();
		custObj.deposit();
		custObj.withdraw();

		
		Bank B = new Bank();
		B.RunUpdateBalance();
	}

}
