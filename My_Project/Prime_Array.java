package My_Project;

import java.util.Scanner;

public class Prime_Array {
	public int[] readArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array ");
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
				System.out.print(",");
		}
	}
	public boolean isPrime(int x)
	{
		for(int i=2;i<=x/2;i++)
		{
			if(x%i==0)
				return false;
		}
		return true;
	}
	public int countPrime(int[] arr)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			boolean rs=isPrime(arr[i]);
			if(rs)
				count++;
		}
		return count;
	}
}
