package multiThread;
public class Capital_Letter extends Thread 
{
	public void run() 
	{
		for(char ch='A';ch<='Z';ch++)
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
