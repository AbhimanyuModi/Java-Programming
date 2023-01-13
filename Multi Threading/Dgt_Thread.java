package multiThread;
public class Dgt_Thread extends Thread
{
		public void run()
		{
			for(char ch='0';ch<='9';ch++)
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
