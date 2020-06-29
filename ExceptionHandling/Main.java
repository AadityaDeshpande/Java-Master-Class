package ExceptionHandling;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 15;
			try {
				if (age < 18)
				{
					throw new LessAgeException();
				}
			}
			catch(LessAgeException e) {
				System.out.println(e);
			}

	}

}
