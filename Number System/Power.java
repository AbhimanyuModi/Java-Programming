import java.util.Scanner;
public class Power
{
    static int isPower(int x,int y)
    {
	int pa=1;
	for(int i=1;i<=y;i++)
	{
	     pa=pa*x;
	}
	return pa;
    }
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter base number ");
	int n=sc.nextInt();
	System.out.println("Enter power number ");
	int p=sc.nextInt();
	int power=isPower(n,p);
	System.out.println(p+" power of "+n+" is "+power); 
    }
}