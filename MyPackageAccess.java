import Demo.Sample;
import ExceptionHandling.Sample2;


public class MyPackageAccess extends Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sample sc = new Sample();
		
		sc.displaySample();

		// when inner class is private
//		MyPackageAccess oth = null;
//		oth.createInstance();
		
		
		
		
//		//Way to instantiate inner class (when class its protected)
		Sample.myInnerClass inn = sc.new myInnerClass();
//		
		inn.displayInner();
		
		
		
		Sample2 sc2 = new Sample2();
		
		
		
		
	
	}

}
