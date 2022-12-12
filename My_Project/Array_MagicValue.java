package My_Project;
import java.util.Scanner;
public class Array_MagicValue {
	public static void main(String[] args) {
		Array_MagicValue am=new Array_MagicValue();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array ");
		int n=sc.nextInt();
		System.out.println("Enter "+n+" number of elements ");
		int ar[]=new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		am.isMagic(ar);
	}
	public static void isMagic(int ar[])
	{
		for(int i=0;i<=(ar.length-1)/2;i++)
		{
			if(ar[i]==ar[ar.length-i-1])
			{
				System.out.println("Magic Value is "+ar[i]);
			}
		}
	}
}
