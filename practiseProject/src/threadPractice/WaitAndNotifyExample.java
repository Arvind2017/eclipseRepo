package threadPractice;

public class WaitAndNotifyExample {
	
	public static void main(String []arg) throws InterruptedException
	{
		ThreadA b=new ThreadA();
		b.start();
		synchronized (b) {
			for(int i=0;i<10;i++)
			{
				System.out.println("main thread called the child  thread");
				b.wait();
				System.out.println("main thread got the notification");
				System.out.println("Value of i is="+b.index);

			}
		}
		
	}

}
