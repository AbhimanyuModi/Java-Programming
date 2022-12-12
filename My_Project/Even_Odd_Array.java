package My_Project;

import java.util.Scanner;

public class Even_Odd_Array {
	public int[] readArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array ");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter "+n+" Values ");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		return ar;
	}
	public void display(int[] ar)
	{
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]);
			if(i<ar.length-1)
				System.out.print(", ");
		}
		System.out.println();
	}
	public int countEven(int[] ar)
	{
		int count=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
				count++;
		}
		return count;
	}
	public int countOdd(int[] ar)
	{
		int count=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2!=0)
				count++;
		}
		return count;
	}
}
