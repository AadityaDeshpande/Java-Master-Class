package Demo;

public class Sample {
	
	public void displaySample()
	{
		System.out.println("Inside displaySample of Sample");
	}
	
	// When made inner class private
	protected void createInstance() {
		
		myInnerClass i = new myInnerClass();
		
		i.displayInner();
	
	}
	
	
		// Making inner class protected
		public class myInnerClass {
		
			public myInnerClass() 
			{
				// TODO Auto-generated constructor stub
				// needed when inheriting in MyPackageAccess.java
				System.out.println("Inner class constructor MUST");
			}
	
			public void displayInner()
			{
				System.out.println("This is my inner class");
			}
		}
	

	
	
}
