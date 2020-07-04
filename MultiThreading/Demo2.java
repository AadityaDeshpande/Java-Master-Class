package MultiThreading;

class ThreadClass implements Runnable {

	Thread t;
	
	public ThreadClass() {
		// TODO Auto-generated constructor stub
		t = new Thread(t,"New Thread");
		System.out.println("Thread "+ t);
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("this is called by thread "+ this.t.getName());
	}
	
}


public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadClass tc = new ThreadClass();
		
		tc.t.start();
		tc.run();
		
			
	}

}
