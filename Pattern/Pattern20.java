/*
	E 
	D E
	C D E
	B C D E
	A B C D E	
*/
import java.util.Scanner;
public class Pattern20
{
   public static void main(String[] args)
   {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of n ");
	int n=sc.nextInt();
	for(int i=n;i>=1;i--)
	{
	    for(int j=i;j<=n;j++)
	    {
		System.out.print((char)(64+j)+" ");
	    }
	    System.out.println();
	}
   }
}