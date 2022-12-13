/* Diserium number is a number in which the sum of its digits to the power of their respective position is equal to the number itself. ex. 135,175*/

import java.util.Scanner;
public class DiseriumNumber
{
     static boolean isDiserium(int x)
     {
	int dc=DigitCount(x);
	int sum=0,temp=x;
	while(x!=0)
	{
	    int d=x%10;
	    sum=sum+pow(d,dc);
	    dc--;
	    x=x/10;
	}
	return sum==temp;
     }
     static int DigitCount(int n)
     {
	int Count=0;
	while(n!=0)
	{
	    n=n/10;
	    Count++;
	}
	return Count;
     }
     static int pow(int b,int p)
     {
	int power=1;
	while(p>0)
	{
	     power=power*b;
	     p--;
	}
	return power;
     }
     public static void main(String[] args)
     {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number ");
	int n=sc.nextInt();
	boolean rs=isDiserium(n);
	if(rs==true)
	    System.out.println(n+" is a Diserium number");
	else
	    System.out.println(n+" is not a Diserium number");
     }
}