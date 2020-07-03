
public class Students implements Comparable<Students> {
	String name;
	int id;
	float percentage;
	
	Students(String name, int id, float percentage)
	{
		this.name = name;
		this.id = id;
		this.percentage = percentage;
	}
	
 	void displayData(){
		System.out.println("Name: "+name+" ID: "+ id+ " percentage: "+percentage);
	}

	@Override
	public int compareTo(Students o) {
		// TODO Auto-generated method stub
		
		if(percentage > o.percentage)
		{
			return -1; // 1 == this sorts in ascending order 
		}
		// If the incoming object is grater
		// Trick : consider o.percentage at median 
		else if (percentage < o.percentage)
		{
			return 1; //this sorts in descending order
		}
		else 
		{
			return 0;
		}
	}
	
	
}
