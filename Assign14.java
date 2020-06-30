import java.util.Scanner;

public class Assign14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("given string is: Exercise is the best way to keep your mind and body healthy.");
		String src = "Exercise is the best way to keep your mind and body healthy.";
		System.out.println("occurance of a is "+ retCounter(src, 'a'));
		System.out.println("Enter Your string");
		String inp = sc.nextLine();
		System.out.println("Enter a single char");
		char c = sc.next().charAt(0);
		
		System.out.println("occurance of "+c+" is "+retCounter(inp, c));
		
		
	}
	
	public static int retCounter(String src, char a)
	{
		int counter = 0;
		for(int i = 0; i < src.length(); i++)
		{
			if (src.charAt(i) == a)
			{
				counter++;
			}
		}
		return counter;
	}

}
