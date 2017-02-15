package ThreadRunnable;

public class ThreadDemo implements Runnable {
	  
		public void run(){  
		System.out.println("thread is running...");  
		}  
		  
		public static void main(String args[]){  
			ThreadDemo m1=new ThreadDemo();  
		Thread t1 =new Thread(m1);  
		t1.start();  
		 }  
		}  


