package DSA_Project;
import java.util.Arrays;
public class Bucket_Sort 
{
	public static void main(String[] args) 
	{
		int ar[]= {56,28,45,89,72,39,48,25};
		System.out.println("Before Bucket Sort ");
		System.out.println(Arrays.toString(ar));
		bucket_Sort(ar);
		System.out.println("After Bucket Sort ");
		System.out.println(Arrays.toString(ar));
	}

	private static void bucket_Sort(int[] ar) 
	{
		int n=ar.length;
		int max=getMax(ar);
		int bucket[]=new int[max+1];
		for(int i=0;i<=max;i++)
		{
			bucket[i]=0;
		}
		for(int i=0;i<n;i++)
		{
			bucket[ar[i]]++;
		}
		for(int i=0,j=0;i<=max;i++)
		{
			while(bucket[i]>0)
			{
				ar[j++]=i;
				bucket[i]--;
			}
		}
	}

	private static int getMax(int[] ar) 
	{
		int n=ar.length;
		int max=ar[0];
		for(int i=1;i<n;i++)
			if(ar[i]>max)
				max=ar[i];
		return max;
	}
}
