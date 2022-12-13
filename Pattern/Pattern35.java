/*
       1
      1*2
     1*2*3
    1*2*3*4
   1*2*3*4*5
*/
import java.util.Scanner;
public class Pattern35
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
		System.out.print(j);
		if(i>j)
		   System.out.print("*");
	   }
	   System.out.println();
	}
    }
}