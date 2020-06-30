import java.util.Scanner;

public class Assign15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String Username, Password;
		
		
		System.out.println("Enter Username");
		Username = sc.nextLine();
		if(Username.equals("admin"))
		{	
			System.out.println("Found username is : "+Username);
			System.out.println("Enter Password");
			Password = sc.nextLine();
			if(Password.equals("adminuser"))
			{	
				System.out.println("Found Password is : "+Password);
				System.out.println("Success");
			}
			else {
				System.out.println("Password not satisfied");
			}
		}
		
		else {
			System.out.println("Username not satisfied");
		}
		
	}

}
