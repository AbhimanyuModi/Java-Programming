import java.util.Scanner;
public class Perfect_Number
{
   public static void main(String[] args)
   {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number ");
	int n=sc.nextInt();
	boolean rs=isPerfect(n);
	if(rs)
	    System.out.println(n+" is Perfect number");
	else
	    System.out.println(n+" is not Perfect number");
   }
   public static boolean isPerfect(int x)
   {
	return isPerfect(x,1,0);
   }
   public static boolean isPerfect(int a,int b,int sum)
   {
	if(b>a/2)
	   return sum==a;
	if(a%b==0)
	   sum=sum+b;
	return isPerfect(a,b+1,sum); 
   }
}