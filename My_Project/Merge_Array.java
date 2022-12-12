package My_Project;
import java.util.Scanner;
public class Merge_Array {
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
	int[] merge(int ar[],int br[])
	{
		int cr[]=new int[ar.length+br.length];
		for(int i=0;i<ar.length;i++)
		{
			cr[i]=ar[i];
		}
		for(int i=0;i<br.length;i++)
		{
			cr[ar.length+i]=br[i];
		}
		return cr;
	}
}
