package DSA_Project;
import java.util.Arrays;
public class Merge_Sort 
{
	public static void main(String[] args) 
	{
		int ar[]= {56,28,45,89,72,39,48,25};
		System.out.println("Before Merge Sort ");
		System.out.println(Arrays.toString(ar));
		merge_Sort(ar);
		System.out.println("After Merge Sort ");
		System.out.println(Arrays.toString(ar));
	}

	private static void merge_Sort(int[] ar) 
	{
		merge_Sort(ar,0,ar.length-1);
	}

	private static void merge_Sort(int[] ar, int l, int h) 
	{
		if(l<h)
		{
			int m=(l+h)/2;
			merge_Sort(ar,l,m);
			merge_Sort(ar,m+1,h);
			merge(ar,l,m,h);
		}
	}

	private static void merge(int[] ar, int l, int m, int h) 
	{
		int n1=m-l+1;
		int n2=h-m;
		int a[]=new int[n1];
		int b[]=new int[n2];
		for(int i=0;i<n1;i++)
		{
			a[i]=ar[l+i];
		}
		for(int i=0;i<n2;i++)
		{
			b[i]=ar[m+1+i];
		}
		int i=0,j=0,k=l;
		while(i<n1 && j<n2)
		{
			if(a[i]<b[j])
				ar[k++]=a[i++];
			else
				ar[k++]=b[j++];
		}
		while(i<n1)
			ar[k++]=a[i++];
		while(j<n2)
			ar[k++]=b[j++];
	}
}
