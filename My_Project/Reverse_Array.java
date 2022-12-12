package My_Project;
import java.util.Scanner;
public class Reverse_Array {
	public int[] readArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array ");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter "+n+" values ");
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
	public void reverseArray(int[] arr)
	{
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]);
			if(i>0)
				System.out.print(",");
		}
		//By Swapping Method
		/*int i=0,j=arr.length-1;
		while(i<j)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}*/
	}
}
