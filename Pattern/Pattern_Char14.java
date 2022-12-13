/*
	a
	b c
	d e f
	g h i j
	k l m n o
*/

import java.util.Scanner;
public class Pattern_Char14
{
   public static void main(String[] args)
   {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of n ");
	int n=sc.nextInt();
	char ch='a';
	for(int i=1;i<=n;i++)
	{
	    for(int j=1;j<=i;j++)
	    {
		System.out.print(ch+" ");
		ch++;
	    }
	    System.out.println();
	}
   }
}