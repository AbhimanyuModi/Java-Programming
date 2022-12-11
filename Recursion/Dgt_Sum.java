import java.util.Scanner;
public class Dgt_Sum
{
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number ");
	int n=sc.nextInt();
	int sum=dgtSum(n);
	System.out.println("Sum of Digit is "+sum);
    }
    public static int dgtSum(int n)
    {
	if(n==0)
	     return 0;
	return n%10+dgtSum(n/10);
    }
}