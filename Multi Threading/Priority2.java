package multiThread;
public class Priority2 
{
	public static void main(String[] args) 
	{
		Thread t1=new Thread();
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		
		Thread t2=new Thread("Java");
		System.out.println(t2.getId());
		System.out.println(t2.getName());
		System.out.println(t2.getPriority());
		
		Thread t3=new Thread();
		t3.setName("Python");
		t3.setPriority(8);
		System.out.println(t3.getId());
		System.out.println(t3.getName());
		System.out.println(t3.getPriority());
	}
}
