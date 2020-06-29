
public class Tech extends Employee{
	static int hrs_wage = 100;
	
	int hrs_worked;
	
	public Tech(int Eid, String name, int age, int hrs_worked) {
		// TODO Auto-generated constructor stub
		super(Eid,name,age);
		this.hrs_worked = hrs_worked;
	}
	
	int getSalary(){
		return hrs_wage*hrs_worked;
	}
	
	void getData() {
		super.getData();
		System.out.println("Hrs worked = "+ hrs_worked);
		System.out.println("Hrs Wage = "+ hrs_wage);
	}

	public static int getHrs_wage() {
		return hrs_wage;
	}

	public static void setHrs_wage(int hrs_wage) {
		Tech.hrs_wage = hrs_wage;
	}

	public int getHrs_worked() {
		return hrs_worked;
	}

	public void setHrs_worked(int hrs_worked) {
		this.hrs_worked = hrs_worked;
	}
	
}