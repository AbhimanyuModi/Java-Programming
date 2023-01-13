package multiThread;
public class Runnable_Interface_Main 
{
	public static void main(String[] args) 
	{
		Runnable r=new Runnable_Interface();
		Thread t1=new Thread(r);
		Thread t2=new Capital_Letter();
		t1.start();
		t2.start();
	}
}
