/*
           1
          212
         32123
        4321234
       543212345
*/
import java.util.Scanner;
public class Pattern41
{
     public static void main(String[] args)
     {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of n");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{
	    for(int j=1;j<=n-i;j++)
	    {
		System.out.print(" ");
	    }
	    for(int j=i;j>=1;j--)
	    {
		System.out.print(j);
	    }
	    for(int j=2;j<=i;j++)
	    {
		System.out.print(j);
	    }
	    System.out.println();
	}
     }
}