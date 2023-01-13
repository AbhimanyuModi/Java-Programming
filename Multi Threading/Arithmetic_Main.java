package multiThread;
public class Arithmetic_Main
{
	public static void main(String[] args) 
	{
		Arithmetic ar=new Arithmetic(25, 10);
		Thread t1=new Thread()
		{
			public void run()
			{
				ar.display();
			}
		};
		Thread t2=new Thread()
		{
			public void run()
			{
				ar.update();
			}
		};
		t1.start();
		t2.start();
	}
}
