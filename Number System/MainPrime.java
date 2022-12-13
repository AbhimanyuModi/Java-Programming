import java.util.Scanner;
public class MainPrime
{
    static boolean isPrime(int x)
    {
	int Count=0;
	for(int i=1;i<=x;i++)
	{
	    if(x%i==0)
		Count++;
	}
	if(Count==2)
	    return true;
	else
	    return false;
    }
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number ");
	int n=sc.nextInt();
	boolean rs=isPrime(n);
	if(rs==true)
	    System.out.println(n+" is a prime number");
	else
	    System.out.println(n+" is not a prime number");
    }
}