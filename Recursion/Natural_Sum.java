import java.util.Scanner;
public class Natural_Sum
{
   public static void main(String[] args)
   {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number ");
	int n=sc.nextInt();
	System.out.println("Sum of "+n+" natural number "+Natural_Sum(n));
	sc.close();
   }
   public static int Natural_Sum(int n)
   {
	if(n==0)
	     return 0;
	return n+Natural_Sum(n-1);
   }
}