// Inter Thread Communication

package multiThread;
public class Bank 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Account ac=new Account(5000);
		Thread t1=new Thread()
		{
			public void run()
			{
				ac.withdraw(8000);
			}
		};
		Thread t2=new Thread() 
		{
			public void run()
			{
				ac.deposit(2000);
			}
		};
		Thread t3=new Thread()
		{
			public void run()
			{
				ac.deposit(5000);
			}
		};
		t1.start();
		Thread.sleep(5000);
		t2.start();
		Thread.sleep(8000);
		t3.start();
	}
}
