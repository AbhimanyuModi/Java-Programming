import java.util.Scanner;
public class Prime_Within_n
{
    static boolean isPrime(int x)
    {
	for(int i=2;i<=x/2;i++)
	    if(x%i==0)
	    {
	       return false;
	    }
	return true;
    }
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Range to find prime ");
	int n=sc.nextInt();
	System.out.println("Prime number is ");
	for(int i=2;i<=n;i++)
	{
	   boolean rs=isPrime(i);
	   if(rs==true)
	   System.out.println(i+" ");
	}    
    }
}