package DSA_Project;
import java.util.Arrays;
public class Quick_Sort 
{
	public static void main(String[] args) 
	{
		int ar[]= {56,28,45,89,72,39,48,25};
		System.out.println("Before Quick Sort ");
		System.out.println(Arrays.toString(ar));
		quick_Sort(ar);
		System.out.println("After Quick Sort ");
		System.out.println(Arrays.toString(ar));

	}

	private static void quick_Sort(int[] ar) 
	{
		quick_Sort(ar,0,ar.length-1);
	}

	private static void quick_Sort(int[] ar, int l, int h)
	{
		if(l<h)
		{
			int pr=partition(ar,l,h);
			quick_Sort(ar,l,pr-1);
			quick_Sort(ar,pr+1,h);
		}
	}

	private static int partition(int[] ar, int l, int h)
	{	
		int pivot=ar[h];
		int i=l-1;
		for(int j=l;j<=h-1;j++)
		{
			if(ar[j]<pivot)
			{
				i++;
				int temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
			}
		}
		int temp=ar[i+1];
		ar[i+1]=ar[h];
		ar[h]=temp;
		return i+1;
	}
}
