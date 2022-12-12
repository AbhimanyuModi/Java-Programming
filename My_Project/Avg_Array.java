package My_Project;
import java.util.Scanner;
public class Avg_Array {
	public int[] readArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array ");
		int n=sc.nextInt();
		int ar[]=new int[n];
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
	public double avgArray(int[] arr)
	{
		double avg=0,sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			avg=sum/arr.length;
		}
		return avg;
	}
}

