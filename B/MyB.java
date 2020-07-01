package B;

public class MyB extends A.MyA{

	public void foo( MyB obj )
	{
		obj.display();
	}
	
	public static void main(String[] args)
	{
		MyD b = new MyD();
		
		b.foo(b);
		
	}
}

class MyC extends MyB {

}

class MyD extends MyC {
	
}
