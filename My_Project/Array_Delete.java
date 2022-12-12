package My_Project;
import java.util.Scanner;
public class Array_Delete {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Array_Delete ad=new Array_Delete();
		int x[]=ad.readArray();
		System.out.println("User entered Array is ");
		ad.display(x);
		System.out.println("Insert index number where to want delete element ");
		int index=sc.nextInt();
		System.out.println("After deleting element new Array is ");
		int z[]=ad.deleteArray(x, index);
		ad.display(z);
	}
	public int[] readArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array ");
		int n=sc.nextInt();	
		int[] ar=new int[n];
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
		System.out.println();
	}
	public int [] deleteArray(int ar[], int index)
	{
		if(index<0 || index>=ar.length)
		{
			System.out.println("Index is not in the Range");
			return ar;
		}
		int br[]=new int[ar.length-1];
		for(int i=0;i<ar.length-1;i++)
		{
			if(i<index)
				br[i]=ar[i];
			else
				br[i]=ar[i+1];
		}
		return br;
	}
}

