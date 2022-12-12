package My_Project;
import java.util.Scanner;
public class Spiral_Matrix_CC {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of Rows ");
		int row=sc.nextInt();
		System.out.println("Enter number of Columns ");
		int col=sc.nextInt();
		if(row==col)
		{
			System.out.println("Enter "+row*col+" elements Row Wise ");
			int[][] mat=new int[row][col];
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
			System.out.println("Spiral Matrix in ClockWise Direction ");
			printSpiral(mat);
		}
		else
		{
			System.out.println("It is not possible to make Spiral");
			System.out.println("Please Enter Same value");
		}
	}

	private static void printSpiral(int[][] mat) 
	{
		int n=mat.length;
		for(int i=0,j=n-1;i<j;j--,i++)
		{
			for(int k=i;k<j;k++)
			{
				System.out.print(mat[i][k]+" ");
			}
			for(int k=i;k<j;k++)
			{
				System.out.print(mat[k][j]+" ");
			}
			for(int k=j;k>i;k--)
			{
				System.out.print(mat[j][k]+" ");
			}
			for(int k=j;k>i;k--)
			{
				System.out.print(mat[k][i]+" ");
			}
		}
		if(n%2==1)
		{
			System.out.print(mat[n/2][n/2]);
		}
	}
}

