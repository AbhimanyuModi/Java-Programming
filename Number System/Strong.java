/*Strong number is a number whose sum of factorial of its digit is equal to that number*/

import java.util.Scanner;
public class Strong
{
   static boolean isStrong(int x)
   {
	int sum=0,temp=x;
	while(x!=0)
	{
	    int fact=1;
	    int d=x%10;
	    x=x/10;
	    for(int i=1;i<=d;i++)
	    {
		fact=fact*i;
	    }
	    sum=sum+fact;
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
	boolean rs=isStrong(n);
	if(rs==true)
	    System.out.println(n+" is a Strong number");
	else
	    System.out.println(n+" is not a Strong number");
   }
}