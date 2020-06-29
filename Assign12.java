import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;


/*
 * Practice example 12: Saving the bank balance.



Create a file named balance.txt in your java projects folder which saves existing bank balance.

Save an amount of 1000 to it.

Accept the deposit amount from the user.

Read the current balance from the balance.txt file.

Add the current balance with the deposit amount and save it back to the file.
 */


public class Assign12 {

	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		File outFile = new File("balance.txt");
		outFile.createNewFile(); // if file already exists will do nothing
		FileOutputStream out =new FileOutputStream(outFile,false);
		FileInputStream in = new FileInputStream("balance.txt");
		
		int TotalBalance;
		String bal = "1000";
		byte [] b = bal.getBytes();
		out.write(b);
		
		System.out.println("Enter deposit amount: ");
		int deposit_amount = Integer.parseInt(br.readLine());
		
		int i = in.read();
		String outString = "";
		while(i != -1)
		{
//			System.out.println((char)i);
			outString += (char)i;
			i = in.read();
			
		}
		System.out.println("Balance in file is " +outString);
		TotalBalance = Integer.parseInt(outString);
		
		TotalBalance += deposit_amount;
		
		byte[] brr = Integer.toString(TotalBalance).getBytes();
		
		out.write(brr);
		//open the file again to clear the input
		out.close();
		in.close();
		
	}

}
