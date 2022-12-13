/*Perfect Number is a number if the sum of its all divisors except that number is equal to that number example 6={1,2,3}*/ 
import java.util.Scanner;
public class MainPerfect
{
    static boolean isPerfectNumber(int x)
    {
	int sum=0;
	for(int i=1;i<=x/2;i++)
	{
	    if(x%i==0)
		sum=sum+i;
	}
	if(sum==x)
	    return true;
	else
	    return false;
    }
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number ");
	int n=sc.nextInt();
	boolean rs=isPerfectNumber(n);
	if(rs==true)
	    System.out.println(n+" is a perfect number");
	else
	    System.out.println(n+" is not a perfect number");
    }
}