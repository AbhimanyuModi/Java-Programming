package My_Project;
import java.util.Scanner;
public class Zig_Zag_Array {
	public static void main(String[] args) {
		Zig_Zag_Array za=new Zig_Zag_Array();
		System.out.println("Enter 1st Array Elements ");
		int x[]=za.readArray();	
		System.out.println("User entered 1st Array is ");
		za.display(x);
		System.out.println();
		System.out.println("Enter 2nd Array Elements ");
		int y[]=za.readArray();
		System.out.println("User entered 2nd Array is ");
		za.display(y);
		System.out.println();
		int[] z=za.zigzag(x, y);
		System.out.println("Array after Zig-Zag ");
		za.display(z);
		
	}
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
			{
				System.out.print(",");
			}
		}
	}
	public int[] zigzag(int ar[],int br[])
	{
		int cr[]=new int[ar.length+br.length];
		int i=0,j=0;
		while(i<ar.length && i<br.length)
		{
			cr[j]=ar[i];
			j++;
			cr[j]=br[i];
			i++;
			j++;
		}
		while(i<ar.length)
		{
			cr[j]=ar[i];
			i++;
			j++;
		}
		while(i<br.length)
		{
			cr[j]=br[i];
			i++;
			j++;
		}
		return cr;
	}
}
