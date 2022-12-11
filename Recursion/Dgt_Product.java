import java.util.Scanner;
public class Dgt_Product
{
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number ");
	int n=sc.nextInt();
	int prod=dgtprod(n);
	System.out.println("Product of Digit is "+prod);
    }
    public static int dgtprod(int n)
    {
	if(n<10)
	     return n;
	return n%10*dgtprod(n/10);
    }
}