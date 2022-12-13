/*
           5
          54
         543
        5432
       54321
*/
import java.util.Scanner;
public class Pattern43
{
     public static void main(String[] args)
     {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of n");
	int n=sc.nextInt();
	for(int i=n;i>=1;i--)
	{
	    for(int j=1;j<=i-1;j++)
	    {
		System.out.print(" ");
	    }
	    for(int j=n;j>=i;j--)
	    {
		System.out.print(j);
	    }
	    System.out.println();
	}
     }
}