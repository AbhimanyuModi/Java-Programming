package My_Project;

import java.util.Scanner;

public class ArrayOperation {
	public int[] readArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an Array ");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter "+ n + " values ");
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
		System.out.println();
	}
	public int getBiggest(int[] arr)
	{
		int big=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>big)
				big=arr[i];
		}
		return big;
	}
	public int sumOfArray(int[] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		return sum;
	}
	public int getSmallest(int[] arr)
	{
		int small=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<small)
				small=arr[i];
		}
		return small;
	}
}
