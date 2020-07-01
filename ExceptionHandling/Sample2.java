package ExceptionHandling;

import Demo.Sample;

public class Sample2 extends Sample {
	
	public static void foo()
	{
		Sample2 sc = new Sample2();
		sc.createInstance();
		
		Sample sc2 = new Sample();
		
		Sample.myInnerClass abc =  sc2.new myInnerClass();
	}
	
	
}