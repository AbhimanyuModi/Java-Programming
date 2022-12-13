/*
	a
	b c 
	d e f
	g h i j
	k l m n o
*/
import java.util.Scanner;
public class Pattern14
{
   public static void main(String[] args)
   {
	int k=1;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of n ");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{
	    for(int j=1;j<i+1;j++)
	    {
		System.out.print((char)(k++ +96)+" ");
	    }
	    System.out.println();
	}
   }
}