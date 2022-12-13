/*
	1 2 3 4 5
	1 2 3 4
	1 2 3
	1 2
	1
*/
import java.util.Scanner;
public class Pattern18
{
   public static void main(String[] args)
   {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of n ");
	int n=sc.nextInt();
	for(int i=n;i>=1;i--)
	{
	    for(int j=1;j<=i;j++)
	    {
		System.out.print(j+" ");
	    }
	    System.out.println();
	}
   }
}