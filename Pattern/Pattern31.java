/*
        5
       45
      345
     2345
    12345
*/
import java.util.Scanner;
public class Pattern31
{
    public static void main(String[] args)
    {
 	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of n ");
	int n=sc.nextInt();
	for(int i=n;i>=1;i--)
	{
	   for(int j=i;j>1;j--)
	   {
		System.out.print(" ");
	   }
	   for(int j=i;j<=n;j++)
	   {
		System.out.print(j);
	   }
	   System.out.println();
	}
    }
}