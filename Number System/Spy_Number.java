import java.util.Scanner;
public class Spy_Number
{
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Lower Range ");
	int m=sc.nextInt();
	System.out.println("Enter Upper Range ");
	int n=sc.nextInt();
	System.out.println("Spy number between "+m+" and "+n);
	for(int i=m;i<=n;i++)
	{
	   boolean rs=isSpy(i);
	   if(rs==true)
		System.out.print(i+" ");
	}
    }
    public static boolean isSpy(int n)
    {
	int sum=0,prod=1;
	while(n!=0)
	{
	    int d=n%10;
	    n=n/10;
	    sum=sum+d;
	    prod=prod*d;
	}
	if(sum==prod)
	    return true;
	else
	    return false;
    }
}