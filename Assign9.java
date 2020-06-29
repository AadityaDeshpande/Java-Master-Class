/* Practice example 9: OOP inheritance

Create a class named employee with the following attributes:

Employee ID

Name

Age

The employee class should have the following methods.

Set data, to get employee data from the user.

Get data to display/return all the data from the employee class.

Create another three classes namely Tech, Design, & HR.

The above three classes should inherit from the employee as the attributes and methods of the three classes are common.



In addition to this, each of the Tech, Design & HR classes have their own method called getSalary which calculates salary differently.

For example,

Tech department employees get paid on the hourly basis. I.e salary = hourly wage * hours worked

Design department gets paid on a weekly basis. I.e salary = weekly wage * weeks worked

HR department gets paid on monthly basis. I.e salary = monthly wage * months worked.





Once the above mentioned attributes and methods are created, create an object of each class i.e Tech, Design & HR and invoke the following methods on them:



Set data.

Get data.

getSalary. */

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
