package multiThread;
public class Arithmetic 
{
	int a;
	int b;
	public Arithmetic(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	synchronized void display()
	{
		System.out.println("A value is : "+a);
		System.out.println("B value is : "+b);
		try {
			Thread.sleep(3000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.println("Sum is : "+(a+b));
		System.out.println("Difference is : "+(a-b));
		System.out.println("Product is : "+(a*b));
		System.out.println("Quotient is : "+(a/b));
		System.out.println("Remainder is : "+(a%b));
	}
	synchronized void update()
	{
		this.a=a+100;
		this.b=b+100;
		System.out.println("A value is : "+a);
		System.out.println("B value is : "+b);
	}
}
