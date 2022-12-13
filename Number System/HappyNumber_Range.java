import java.util.Scanner;
public class HappyNumber_Range
{
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Lower Range ");
	int m=sc.nextInt();
	System.out.println("Enter Upper Range ");
	int n=sc.nextInt();
	System.out.println("Happy number between "+m+" and "+n);
	for(int i=m;i<=n;i++)
	{
	   boolean rs=isHappy(i);
	   if(rs==true)
		System.out.print(i+" ");
	}
    }
    public static boolean isHappy(int n)
    {
	while(n>9)
	{
	   int sum=0;
	   while(n!=0)
	   {
	      int d=n%10;
	      n=n/10;
	      sum=sum+d*d;
	   }
	   n=sum;
	}
	return n==1 || n==7;
    }
}