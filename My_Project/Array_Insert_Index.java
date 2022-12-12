package My_Project;
import java.util.Scanner;
public class Array_Insert_Index {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Array_Insert_Index ai=new Array_Insert_Index();
		System.out.println("Enter 1st Array Elements ");
		int x[]=ai.readArray();	
		System.out.println("User entered 1st Array is ");
		ai.display(x);
		System.out.println();
		System.out.println("Enter 2nd Array Elements ");
		int y[]=ai.readArray();
		System.out.println("User entered 2nd Array is ");
		ai.display(y);
		System.out.println("Insert index number where to want insert 2nd Array ");
		int index=sc.nextInt();
		int z[]=ai.insertArray(x,y,index);
		System.out.println();
		System.out.println("After merge new Array is ");
		ai.display(z);
	}
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
	public int[] insertArray(int ar[],int br[],int index)
	{
		if(index<0 || index>ar.length)
		{
			System.out.println("Index not in the Range");
			return ar;
		}
		int cr[]=new int[ar.length+br.length];
		for(int i=0;i<ar.length;i++)
		{
			if(i<index)
				cr[i]=ar[i];
			else
				cr[i+br.length]=ar[i];
		}
		for(int i=0;i<br.length;i++)
		{
			cr[index+i]=br[i];
		}
		return cr;
	}
}
