package multiThread;
public class Priority_Main 
{
	public static void main(String[] args) 
	{
		Thread t1=Thread.currentThread();
		System.out.println("Id : "+t1.getId());
		System.out.println("Name : "+t1.getName());
		System.out.println("Priority : "+t1.getPriority());
	}
}
