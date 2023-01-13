package multiThread;
public class MainRunner2 
{
	public static void main(String[] args) {
		System.out.println("MMS");
		Sample1 s1=new Sample1();
		class MyThread1 extends Thread
		{
			public void run() 
			{
				s1.display();
			}
		}
		class MyThread2 extends Thread
		{
			public void run()
			{
				s1.write();
			}
		}
		Thread t1=new MyThread1();
		Thread t2=new MyThread2();
		t1.start();
		t2.start();
		System.out.println("MME");
	}
}

class Sample1
{
	void display() 
	{
		for (int i = 1; i <=10; i++) 
		{
			System.out.println("JSpider "+i);
			if(i==5)
				try {
					Thread.sleep(8000);
				}
			catch (InterruptedException e) 
			{
					System.out.println(e);
			}
		}
	}
	void write() 
	{
		for(int i=1;i<=10;i++)
			System.out.println("QSpider "+i);
	}
}
