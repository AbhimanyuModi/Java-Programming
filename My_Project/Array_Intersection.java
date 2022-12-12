package My_Project;
import java.util.Scanner;
public class Array_Intersection {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Array_Intersection ai=new Array_Intersection();
		System.out.println("Enter 1st Array Elements ");
		int x[]=ai.readArray();	
		System.out.println("Enter 2nd Array Elements ");
		int y[]=ai.readArray();
		int z[]=ai.intersection(x, y);
		System.out.println("Common elements between two Array ");
		ai.display(z);
	}
	public int[] readArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array ");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter "+n+" elements of Array ");
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
	public int[] intersection(int ar[],int br[])
	{
		int k=0;
		int cr[]=new int[ar.length];
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<br.length;j++)
			{
				if(ar[i]==br[j])
				{
					cr[k]=ar[i];
					k++;
					break;
				}
			}
		}
		int rs[]=new int[k];
		for(int i=0;i<k;i++)
		{
			rs[i]=cr[i];
		}
		return rs;
	}
}
