package My_Project;
import java.util.Scanner;
public class First_Duplicate_Array 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array ");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		firstRepeat(a);
	}

	private static void firstRepeat(int[] a)//1 2 1 2 1
	{
		int x=0,count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					x=a[i];
					count++;//2
					break;
				}
			}
			if(count==1)
			break;
		}
		if(x==0)
			System.out.println("no repeated");
		else
			System.out.println(x);
	}		
}


