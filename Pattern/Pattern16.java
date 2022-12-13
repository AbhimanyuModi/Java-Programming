/*
	1 1 1 1 1
	0 0 0 0 0
	1 1 1 1 1
	0 0 0 0 0
	1 1 1 1 1
*/
import java.util.Scanner;
public class Pattern16
{
   public static void main(String[] args)
   {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of n ");
	int n=sc.nextInt();
	for(int i=n;i>=1;i--)
	{
	    for(int j=n;j>=1;j--)
	    {
		System.out.print(i%2+" ");
	    }
	    System.out.println();
	}
   }
}