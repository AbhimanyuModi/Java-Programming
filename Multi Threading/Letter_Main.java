package multiThread;
public class Letter_Main 
{
	public static void main(String[] args) 
	{
		Thread t1=new Small_Letter();
		Thread t2=new Capital_Letter();
		t1.start();
		t2.start();
	}
}
