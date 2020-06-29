/* Practice example 7: OOP creating classes and objects.

Create a class named Programmer with attributes name, id, & salary.

Initialise the values as follows name=”john”, id=”1” salary =”1000”

Create an object of the above class and display the attributes of the object.

Try changing the attributes of the object in the main method and display changed attributes. */

class Programmer{
	private String name;
	int id;
	int salary;
	
	public Programmer() {
		// TODO Auto-generated constructor stub
		name = "John";
		id = 1;
		salary = 1000;
	}
	
	void display() {
		System.out.println(name +"  "+ id +"  "+salary );
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}


public class Assign7 {

	public static void main(String[] args) {
		Programmer obj = new Programmer();
		obj.display();
		obj.setName("Aaditya");
		obj.setId(0);
		obj.setSalary(100000);
		obj.display();

	}

}
