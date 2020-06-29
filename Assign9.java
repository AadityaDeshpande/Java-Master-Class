public class Assign9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tech techObj = new Tech(1, "Mahesh", 30, 40);
		techObj.getData();
		System.out.println("Salary is "+techObj.getSalary());
		techObj.setHrs_worked(50);
		techObj.getData();
		System.out.println("Salary is "+techObj.getSalary());
		
		HR myHr = new HR(2, "Ram", 25, 6);
		myHr.getData();
		System.out.println("Salary is "+myHr.getSalary());
		myHr.setName("Shyam");
		myHr.getData();
		System.out.println("Salary is "+myHr.getSalary());		
		
		Design myDesign = new Design(3,"Aaditya",23,5);
		myDesign.getData();
		System.out.println("Salary is "+myDesign.getSalary());
		// myDesign.setWeeks_wage(500000);
		Design.setWeeks_wage(500000); //in static way
		
		myDesign.getData();
		System.out.println("Salary is "+myDesign.getSalary());
		
	}

}
