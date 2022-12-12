package My_Project;
import java.util.Scanner;
public class Palindrome_Array {
	public int[] readArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array ");
		int n=sc.nextInt();
		int[] ar=new int[n];
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
	}
	public boolean isPalindrome(int x)
	{
		int rev=0,temp=x;
		while(x!=0)
		{
			int d=x%10;
			rev=rev*10+d;
			x=x/10;
		}
		if(rev==temp)
			return true;
		else
			return false;
	}
	public int countPalindrome(int[] arr)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			boolean rs=isPalindrome(arr[i]);
			if(rs)
				count++;
		}
		return count;
	}
}
