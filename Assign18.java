
class Privatebank implements BankRules {
	String customer_name;
	
	Privatebank(String customer_name)
	{
		this.customer_name = customer_name;
	}

	@Override
	public void interest_paid() {
		// TODO Auto-generated method stub
		System.out.println(customer_name+" is paid an interest of 5%");
	}
	
}

class Govbank implements BankRules {
	String customer_name;
	
	Govbank(String customer_name)
	{
		this.customer_name = customer_name;
	}

	@Override
	public void interest_paid() {
		// TODO Auto-generated method stub
		System.out.println(customer_name + " is paid an interest of 7%");
	}
}

public class Assign18 {
	
	public static void main(String[] args) {
		
		Privatebank pbank = new Privatebank("rahul");
		
		pbank.interest_paid();
		
		Govbank gbank = new Govbank("Ram");
		
		gbank.interest_paid();
		
		
	}
}
