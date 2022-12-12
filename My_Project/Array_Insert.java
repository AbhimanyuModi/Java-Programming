package My_Project;
import java.util.Scanner;
public class Array_Insert {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Array_Insert ai=new Array_Insert();
		int x[]=ai.readArray();
		System.out.println("User entered Array is ");
		ai.display(x);
		System.out.println("Insert element in the Array ");
		int element=sc.nextInt();
		System.out.println("Insert index number where to want insert new element ");
		int index=sc.nextInt();
		System.out.println("After inserting element new Array is ");
		int z[]=ai.insertArray(x, element, index);
		ai.display(z);
	}
	public int[] readArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array ");
		int n=sc.nextInt();	
		int[] ar=new int[n];
		System.out.println("Enter "+n+" Values ");
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
	public int [] insertArray(int ar[], int element, int index)
	{
		if(index<0 || index>ar.length)
		{
			System.out.println("Index is not in the Range");
			return ar;
		}
		int br[]=new int[ar.length+1];
		br[index]=element;
		for(int i=0;i<ar.length;i++)
		{
			if(i<index)
				br[i]=ar[i];
			else
				br[i+1]=ar[i];
		}
		return br;
	}
}
