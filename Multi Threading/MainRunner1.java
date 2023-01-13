package multiThread;

public class MainRunner1 
{
	static int p=15;
	int q=25;
	public static void main(String[] args) {
		System.out.println("MMS");
		System.out.println("P value is "+p);
		MainRunner1 mr=new MainRunner1();
		System.out.println("Q value is "+mr.q);
		Sample s=new Sample();
		System.out.println("X value is "+s.x);
		System.out.println("Y value is "+s.y);
		s.x=100;
		s.y=200;
		System.out.println("X value is "+s.x);
		System.out.println("Y value is "+s.y);
		s.display();
		System.out.println("MME");
	}
}

class Sample 
{
	int x=10;
	static int y=20;
	void display()
	{
		int a=10;
		System.out.println("A value is "+a);
		System.out.println("X value is "+x);
		System.out.println("Y value is "+y);
	}
}

