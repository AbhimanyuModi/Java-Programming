package My_Project;
import java.util.Scanner;
public class Array_Sort {
	public static void main(String[] args) {
		Array_Sort as=new Array_Sort();
		System.out.println("Enter the first sorted Array elements ");
		int x[]=as.readArray();
		System.out.println("User entered first Array is ");
		as.display(x);
		System.out.println();
		System.out.println("Enter the second sorted Array elements ");
		int y[]=as.readArray();
		System.out.println("User entered second Array is ");
		as.display(y);
		int z[]=as.mergeSort(x,y);
		System.out.println();
		System.out.println("After merge sorted Array is ");
		as.display(z);
	}
	public int[] readArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array ");
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
	public int[] mergeSort(int ar[],int br[])
	{
		int cr[]=new int[ar.length+br.length];
		int i=0,j=0,k=0;
		while(i<ar.length && j<br.length)
		{
			if(ar[i]<br[j])
			{
				cr[k]=ar[i];
				i++;
			}
			else
			{
				cr[k]=br[j];
				j++;
			}
			k++;
		}
		while(i<ar.length)
		{
			cr[k]=ar[i];
			i++;
			k++;
		}
		while(j<br.length)
		{
			cr[k]=br[j];
			j++;
			k++;
		}
		return cr;
	}
}
