import java.util.Scanner;
public class Prime
{
   static boolean isPrime(int x)
   {
	for(int i=2;i<=x/2;i++)
	{
	    if(x%i==0)
		return false;
	}
	return true;
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