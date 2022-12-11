import java.util.Scanner;
public class Reverse
{
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number ");
	int n=sc.nextInt();
	int rev=isReverse(n);
	System.out.println("Reverse of number is "+rev);
    }
    public static int isReverse(int x)
    {
	return reverse(x,0);
    }
    public static int reverse(int x,int rev)
    {
	if(x==0)
	     return rev;
	return reverse(x/10,rev*10+x%10);
    }
}