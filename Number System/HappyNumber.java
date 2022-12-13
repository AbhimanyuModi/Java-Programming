/*Happy number is a number which eventually reaches 1 or 7 when replace by the sum of the square of each digit. ex. 13,23,94,49 etc*/

import java.util.Scanner;
public class HappyNumber
{
    static boolean isHappy(int x)
    {
        while(x>9)
        {
	   int sum=0;
	   while(x!=0)
	   {
	       int d=x%10;
	       sum=sum+d*d;
	       x=x/10;
	   }
	   x=sum;
	}
	return x==1 || x==7;
    }
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number ");
	int n=sc.nextInt();
	boolean rs=isHappy(n);
	if(rs==true)
	     System.out.println(n+" is a Happy number");
	else
	     System.out.println(n+" is a Sad number");
    }
}