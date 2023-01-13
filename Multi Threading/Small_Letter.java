package multiThread;
public class Small_Letter extends Thread
{
	public void run()
	{
		for(char ch='a';ch<='z';ch++)
		{
			System.out.println(ch);
			try {
				Thread.sleep(100);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
