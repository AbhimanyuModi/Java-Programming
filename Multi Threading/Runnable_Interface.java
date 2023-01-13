package multiThread;
public class Runnable_Interface implements Runnable
{
	@Override
	public void run()
	{
		for(int i=1;i<=5;i++)
			System.out.println(i);
	}
}
