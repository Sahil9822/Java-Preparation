

public class Multithreading 
{
	public static void main(String[] args) 
	{
		Thread thread1 = new Thread(new Runnable() 
		{
			public void run() 
			{
				for (int i = 1; i <= 10; i++) 
				{
					System.out.println("Thread 1 - Count: " + i);
		        }
		    }
		 });
		 thread1.start();
		 // Create and start the second thread
		 Thread thread2 = new Thread(new Runnable() 
		 {
			 public void run() 
			 {
				 for (int i = 1; i <= 10; i++) 
				 {
					 System.out.println("Thread 2 - Count: " + i);
			     }
		     }
		 });
		 thread2.start();
		 // Create and start the third thread
		 Thread thread3 = new Thread(new Runnable() 
		 {
			 public void run() 
			 {
				 for (int i = 1; i <= 10; i++) 
				 {
					 System.out.println("Thread 3 - Count: " + i);
		         }
		     }
		 });
		 thread3.start();
	}
}
