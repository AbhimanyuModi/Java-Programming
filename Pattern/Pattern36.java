/*
         1
        00
       111
      0000
     11111
*/
import java.util.Scanner;
public class Pattern36
{
    public static void main(String[] args)
    {
 	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of n ");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{
	   for(int j=1;j<=n-i;j++)
	   {
		System.out.print(" ");
	   }
	   for(int j=i;j>=1;j--)
	   {
		System.out.print(i%2);
	   }
	   System.out.println();
	}
    }
}