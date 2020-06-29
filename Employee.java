
public class Employee{
	int Eid;
	String name;
	int age;
	
	public Employee(int Eid, String name, int age) {
		// TODO Auto-generated constructor stub
		this.age = age;
		this.name = name;
		this.Eid = Eid;
	}
	
	void getData() {
		System.out.println("Employee id is = " + Eid);
		System.out.println("Employee name is = " + name);
		System.out.println("Employee age is = " + age);
	}
	
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
}
