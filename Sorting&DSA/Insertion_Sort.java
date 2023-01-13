package DSA_Project;
import java.util.Arrays;
public class Insertion_Sort 
{
	public static void main(String[] args) 
	{
		int ar[]= {34,23,45,28,56,78,21};
		System.out.println("Before Insertion Sort ");
		System.out.println(Arrays.toString(ar));
		insertion_Sort(ar);
		System.out.println("After Insertion Sort ");
		System.out.println(Arrays.toString(ar));
	}

	private static void insertion_Sort(int[] ar) 
	{
		for(int i=1;i<ar.length;i++)
		{
			int key=ar[i];
			int j=i-1;
			while(j>-1 && ar[j]>key)
			{
				ar[j+1]=ar[j];
				j--;
			}
			ar[j+1]=key;
		}
	}
}
