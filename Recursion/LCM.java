import java.util.Scanner;
public class LCM
{
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1st number ");
	int m=sc.nextInt();
	System.out.println("Enter 2nd number ");
	int n=sc.nextInt();
	System.out.println("LCM of "+m+" and "+n+" is "+getLCM(m,n));
    }
    public static int getLCM(int m,int n)
    {
	int lcm=m*n/gcd(m,n);
	return lcm;
    }
    public static int gcd(int m,int n)
    {
	if(m<n)
  	    return gcd(n,m);
	if(m%n==0)
	    return n;
	return gcd(n,m%n);
    }
}