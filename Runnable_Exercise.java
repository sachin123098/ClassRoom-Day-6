class Runnable_Exercise implements Runnable{
   public void run(){
      System.out.println("Runnable");
   }
   

   public static void main(String args[]){
      Runnable_Exercise runnable=new Runnable_Exercise();
      Thread t1 =new Thread(runnable);
      t1.start();
   }
}


