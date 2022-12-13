/*
	A
	B A
	C B A
	D C B A
	E D C B A
*/
import java.util.Scanner;
public class Pattern13
{
   public static void main(String[] args)
   {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of n ");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{
	    for(int j=i;j>=1;j--)
	    {
		System.out.print((char)(j+64)+" ");
	    }
	    System.out.println();
	}
   }
}