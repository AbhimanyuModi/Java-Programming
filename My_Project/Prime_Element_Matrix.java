package My_Project;
import java.util.Scanner;
public class Prime_Element_Matrix {
	static int x;
	public static void main(String[] args) 
	{
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of Rows ");
		int row=sc.nextInt();
		System.out.println("Enter number of Columns ");
		int col=sc.nextInt();
		int mat[][]=new int[row][col];
		System.out.println("Enter "+row*col+" elements Row wise ");
		for(int i=0;i<mat.length;i++)
		{
		    for(int j=0;j<mat[i].length;j++)
		    {
			mat[i][j]=sc.nextInt();
		    }
		}
		System.out.println("User entered Matrix is ");
		for(int i=0;i<mat.length;i++)
		{
		    for(int j=0;j<mat[i].length;j++)
		    {
			System.out.print(mat[i][j]+" ");
		    }
		    System.out.println();
		}
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				x=mat[i][j];
				boolean rs=isPrime(mat);
				if(rs)
				{
					count++;
				}
			}
		}
		System.out.println("Prime elements in Matrix is "+count);
	}
	public static boolean isPrime(int[][] mat)
	{
		for(int i=2;i<=x/2;i++)
		{
			if(x%i==0)
				return false;
		}
		return true;
	}
}
