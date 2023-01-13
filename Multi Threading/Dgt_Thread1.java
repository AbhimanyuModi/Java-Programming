package multiThread;
public class Dgt_Thread1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Dgt_Thread dt=new Dgt_Thread();
		dt.start();
		Thread.sleep(400);
		dt.suspend();
		Thread.sleep(1000);
		dt.resume();
	}
}
