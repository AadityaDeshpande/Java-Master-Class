import java.util.Scanner;

public class Assign13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String Username, Password;
		
		
		System.out.println("Enter Username");
		Username = sc.nextLine();
		if(Username.length() > 6)
		{	
			System.out.println("Found username is : "+Username);
			System.out.println("Enter Password");
			Password = sc.nextLine();
			if(Password.length() > 8)
			{	
				System.out.println("Found Password is : "+Password);
				System.out.println("Success");
			}
			else {
				System.out.println("Password length not satisfied");
			}
		}
		
		else {
			System.out.println("Username length not satisfied");
		}
		
		
		
		
	}

}
