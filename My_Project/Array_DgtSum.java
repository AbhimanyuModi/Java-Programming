package My_Project;
import java.util.Scanner;
public class Array_DgtSum {
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
	public void replaceByDgtSum(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			int x=ar[i];
			int sum=0;
			do {
				int d=x%10;
				sum=sum+d;
				x=x/10;
			}while(x!=0);
			ar[i]=sum;
			System.out.print(sum);
			if(i<ar.length-1)
				System.out.print(",");
		}
	}
}
