package Lambda;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Using a functional interface in java "number"
		number n; 
		 n= (age) -> 
		 {	 
			 age = age + 1;
			 
			 return age*100;
		 };
		 
		 
		 //way to call lambda in java
		 System.out.println(n.displayNumber(40));
		 
		 
		 
		 /////////////////////////
		 
		 genRick<String> gen = (msg)->{ return msg;  };
		 
		 System.out.println(gen.displayMessage("MYMEssage"));
		 
		 
	}

	
}
