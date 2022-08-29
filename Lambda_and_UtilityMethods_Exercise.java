
public class Lambda_and_UtilityMethods_Exercise {

	   public static void main(String args[]){
		  Thread t1= new Thread (() ->{
			for(int i=0;i<5;i++) {
				System.out.println("1st thread");	
			}  
		  });	
		  
		  Thread t2=new Thread (() ->{
			for(int i=0;i<5;i++) {
				System.out.println("2nd thread");
			}
		  });
	   t1.setName("abcd");
	   t2.setName("yhgtf");
	   
	   t2.setPriority(Thread.MAX_PRIORITY);
	   
	   System.out.println(t1.getName()+t1.getPriority());
	   System.out.println(t2.getName()+t2.getPriority());
	   
	   t1.start();
	   t2.start();
	   
	   System.out.println(t2.isAlive());
	   }
}		  
		  
		  
	      
	   


