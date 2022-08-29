
public class Thread_Exercise extends Thread {
	public void run(){
	      System.out.println("Thread is running");
	   }
	   public static void main(String args[]){
	      Thread_Exercise t1=new Thread_Exercise ();
	      t1.start();
	   }
}


