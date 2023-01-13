package multiThread;
public class MainRunner 
{
	int a=10;
	static int b=20;
	void display()
	{
		System.out.println("I am displaying");
	}
	public static void main(String[] args) {
		System.out.println("Main Method Start");
		System.out.println(b);
		MainRunner mr=new MainRunner();
		System.out.println(mr.a);
		mr.display();
		System.out.println("Main Method End");
	}
}
