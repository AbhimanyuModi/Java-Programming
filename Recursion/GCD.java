import java.util.Scanner;
public class GCD
{
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1st number ");
	int m=sc.nextInt();
	System.out.println("Enter 2nd number ");
	int n=sc.nextInt();
	System.out.println("GCD of "+m+" and "+n+" is "+getGCD(m,n));
    }
    public static int getGCD(int m,int n)
    {
	if(m<n)
	     return getGCD(n,m);
	if(m%n==0)
	     return n;
	return getGCD(n,m%n);
    }
}