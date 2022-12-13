import java.util.Scanner;
public class PrimeSum
{
    static int PrimeSum(int x)
    {
	int sum=0;
	for(int i=2;i<=x;i++)
	{
	     boolean rs=isPrime(i);
	     if(rs==true)
		sum=sum+i;
	}
	return sum;
    }
    static boolean isPrime(int n)
    {
	for(int i=2;i<=n/2;i++)
	{
	    if(n%i==0)
		return false;
	}
	return true;
    }
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number ");
	int n=sc.nextInt();
	int sum=PrimeSum(n);
	System.out.println("Sum of prime number "+sum);
    }
}