package My_Project;
import java.util.Scanner;
public class Array_nth_Biggest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array ");
		int size=sc.nextInt();
		int ar[]=new int[size];
		System.out.println("Enter "+size+" number of elements ");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Which biggest we want ");
		int n=sc.nextInt();
		int big=getBiggest(ar,n);
		System.out.println(n+"th biggest element is "+big);
	}
	public static int getBiggest(int x[],int n)
	{
		for(int i=0;i<x.length;i++)
		{
			int count=0;
			for(int j=0;j<x.length;j++)
			{
				if(x[j]>x[i])
					count++;
			}
			if(count==n-1)
				return x[i];
		}
		return 0;
	}
}
