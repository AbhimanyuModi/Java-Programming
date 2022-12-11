import java.util.Scanner;
public class Fibbo_Number
{
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number ");
	int n=sc.nextInt();
	int fib=getFib(n);
	System.out.println("Fibbonacci number is "+fib);
    }
    public static int getFib(int n)
    {
	if(n==1)
	     return 0;
	if(n==2)
	     return 1;
	return getFib(n-1)+getFib(n-2);
    }
}