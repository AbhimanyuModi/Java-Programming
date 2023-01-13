package DSA_Project;
import java.util.Arrays;
public class Bubble_Sort 
{
	public static void main(String[] args) 
	{
		int ar[]= {34,23,45,28,56,78,21};
		System.out.println("Before Bubble Sort ");
		System.out.println(Arrays.toString(ar));
		bubble_Sort(ar);
		System.out.println("After Bubble Sort ");
		System.out.println(Arrays.toString(ar));
	}

	private static void bubble_Sort(int[] ar) 
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=1;j<ar.length;j++)
			{
				if(ar[j-1]>ar[j])
				{
					int temp=ar[j-1];
					ar[j-1]=ar[j];
					ar[j]=temp;
				}
			}
		}
	}
}
