import java.util.Scanner;
public class Prime
{
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number ");
	int n=sc.nextInt();
	boolean rs=isPrime(n);
	if(rs)
	     System.out.println(n+" is Prime number");
	else
	     System.out.println(n+" is not Prime number");
    }
    public static boolean isPrime(int x)
    {
	return isPrime(2,x);
    }
    public static boolean isPrime(int a,int b)
    {
	if(a>b/2)
	     return true;
	if(b%a==0)
    	     return false;
	return isPrime(a+1,b);
    }
}