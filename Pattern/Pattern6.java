/*
	1
	0 1
	0 1 0
	1 0 1 0
	1 0 1 0 1	
*/

import java.util.Scanner;
public class Pattern6
{
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of n ");
	int n=sc.nextInt();
	int k=1;
	for(int i=1;i<=n;i++)
	{
	    for(int j=1;j<i+1;j++)
	    {
		System.out.print(k++%2 +" ");
	    }
	    System.out.println();
	}
    }
}