package multiThread;
public class Dgt_Thread_Main 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Capital_Letter cl=new Capital_Letter();
		Small_Letter sl=new Small_Letter();
		Dgt_Thread dt=new Dgt_Thread();
		cl.start();
		cl.join();
		
		sl.start();
		sl.join(1700);
		dt.start();
		
	}
}
