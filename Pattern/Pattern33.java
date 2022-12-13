/*
        A
       AB
      ABC
     ABCD
    ABCDE
*/
import java.util.Scanner;
public class Pattern33
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
	   for(int j=1;j<=i;j++)
	   {
		System.out.print((char)(64+j));
	   }
	   System.out.println();
	}
    }
}