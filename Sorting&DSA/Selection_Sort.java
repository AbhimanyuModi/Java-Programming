package DSA_Project;
import java.util.Arrays;
public class Selection_Sort 
{
	public static void main(String[] args) 
	{
		int ar[]= {34,23,45,28,56,78,21};
		System.out.println("Before Selection Sort ");
		System.out.println(Arrays.toString(ar));
		selection_Sort(ar);
		System.out.println("After Selection Sort ");
		System.out.println(Arrays.toString(ar));
	}

	private static void selection_Sort(int[] ar) 
	{
		for(int i=0;i<ar.length;i++)
		{
			int index=i;
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[index]>ar[j])
					index=j;
			}
			int temp=ar[index];
			ar[index]=ar[i];
			ar[i]=temp;
		}
	}
}
