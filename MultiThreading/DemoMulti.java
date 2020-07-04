package MultiThreading;


class Hi implements Runnable {
    public void run(){
        for (int i =0;i<3;i++){
            System.out.println("Hello");
            try{
                Thread.sleep(100);
            } 
            catch(Exception e){
                System.out.println(e);
            }
       }   
    }
}

class Bi implements Runnable {
    public void run(){
        for (int x =0;x<3;x++){
            System.out.println("Goodbye");
            try{
                Thread.sleep(100);
            } 
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}




public class DemoMulti {

	 public static void main(String[ ] args) {
	        Thread h = new Thread(new Hi());
	        Thread b = new Thread(new Bi());
	        try {
	            h.start();
	            //h.sleep(1000);
	            //b.start();
	            //b.sleep(1000);
	        } 
	        catch (Exception e){
	            System.out.println(e);
	        }
	        try{
	            //b.sleep (1000);
	            b.start ();
	        }
	        catch(Exception e) {
	            System.out.println(e);
	        }
	}

}
