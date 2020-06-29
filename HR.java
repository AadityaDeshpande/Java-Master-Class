
public class HR extends Employee{
	static int month_wage = 1000;
	
	int month_worked;
	
	public HR(int Eid, String name, int age, int month_worked) {
		// TODO Auto-generated constructor stub
		super(Eid,name,age);
		this.month_worked = month_worked;
	}
	
	int getSalary(){
		return month_wage*month_worked;
	}
	
	void getData() {
		super.getData();
		System.out.println("month worked = "+ month_worked);
		System.out.println("month Wage = "+ month_wage);
	}

	public static int getMonth_wage() {
		return month_wage;
	}

	public static void setMonth_wage(int month_wage) {
		HR.month_wage = month_wage;
	}

	public int getMonth_worked() {
		return month_worked;
	}

	public void setMonth_worked(int month_worked) {
		this.month_worked = month_worked;
	}
		
}