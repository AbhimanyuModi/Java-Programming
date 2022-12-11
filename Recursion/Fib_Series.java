import java.util.Scanner;
public class Fib_Series
{
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number ");
	int n=sc.nextInt();
	System.out.println("Fibonacci Series is ");
	for(int i=1;i<n+1;i++)
	{
	    System.out.print(getFib(i)+" ");
	}
    }
    public static int getFib(int n)
    {
	if(n==1)
	    return 0;
	else if(n==2)
	    return 1;
	return getFib(n-1)+getFib(n-2);
    }
}