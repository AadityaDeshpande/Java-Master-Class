
public class Design extends Employee{
	static int weeks_wage = 2000;
	
	int weeks_worked;
	
	public Design(int Eid, String name, int age, int weeks_worked) {
		// TODO Auto-generated constructor stub
		super(Eid,name,age);
		this.weeks_worked = weeks_worked;
	}
	
	int getSalary(){
		return weeks_wage*weeks_worked;
	}
	
	void getData() {
		super.getData();
		System.out.println("weeks worked = "+ weeks_worked);
		System.out.println("weeks Wage = "+ weeks_wage);
	}

	public static int getWeeks_wage() {
		return weeks_wage;
	}

	public static void setWeeks_wage(int weeks_wage) {
		Design.weeks_wage = weeks_wage;
	}

	public int getWeeks_worked() {
		return weeks_worked;
	}

	public void setWeeks_worked(int weeks_worked) {
		this.weeks_worked = weeks_worked;
	}
	
}