import java.util.Scanner;
public class Armstrong
{
   static boolean Armstrong(int x)
   {
	int sum=0,temp=x;
	while(x!=0)
	{
	   int d=x%10;
	   sum=sum+d*d*d;
	   x=x/10;
	}
	if(sum==temp)
	   return true;
	else
	   return false;
   }
   public static void main(String[] args)
   {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number ");
	int n=sc.nextInt();
	boolean a=Armstrong(n);
	if(a==true)
	    System.out.println(n+" is a Armstrong number");
	else
	    System.out.println(n+" is not a Armstrong number");
   }
}