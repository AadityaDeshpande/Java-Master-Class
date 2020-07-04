package MultiThreading;


class ThreadClass2 extends Thread {
	
	public ThreadClass2() {
		// TODO Auto-generated constructor stub
		super("New Thread");
		System.out.println(this);
		
	}
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("THread task... "+ this.getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadClass2 tc = new ThreadClass2();
		tc.start();
		
//		try {
//			tc.join();
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Main task... ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
