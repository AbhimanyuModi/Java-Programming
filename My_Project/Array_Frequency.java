package My_Project;
import java.util.Scanner;
public class Array_Frequency {
	public static void main(String[] args) {
		Array_Frequency af=new Array_Frequency();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array ");
		int n=sc.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter "+n+" number of elements ");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		af.printFrequency(ar);
	}
	public void printFrequency(int ar[])
	{
		int big=ar[0];
		for(int i=1;i<ar.length;i++)
		{
			if(big<ar[i])
				big=ar[i];
		}
		int count[]=new int[big+1];
		for(int i=0;i<ar.length;i++)
		{
			count[ar[i]]++;
		}
		for(int i=0;i<=big;i++)
		{
			if(count[i]!=0)
				System.out.println(i+"--->"+count[i]);
		}
	}
	/*public void printFrequency(int ar[])
	{
		boolean check[]=new boolean[ar.length];
		for(int i=0;i<ar.length;i++)
		{
			if(check[i]==false)
			{
				int count=1;
				for(int j=i+1;j<ar.length;j++)
				{
					if(ar[i]==ar[j])
					{
						count++;
						check[j]=true;
					}
				}
				System.out.println("Frequency of "+ar[i]+"--->"+count);
			}
		}
	}*/
}
