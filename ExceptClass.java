
public class ExceptClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(10/1);
		}
		catch(ArithmeticException e) {
			//e.printStackTrace();
			System.out.println("caught");
		}
		catch(Error a) {
			System.out.println("Object");
		}
		//throwable is parent of Exception
		//keep bottoms up hierarchy while writing a catch statements
		catch(Throwable a) {
			System.out.println("Throwable");
		}
//		catch(Exception e) {
//			System.out.println("exception");
//		}
		finally {
			System.out.println("I am executed always");
		}
	}

}
