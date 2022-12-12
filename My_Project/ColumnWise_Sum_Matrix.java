package My_Project;
import java.util.Scanner;
public class ColumnWise_Sum_Matrix {
	public static void main(String[] args) {
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
		int sum[]=columnWiseSum(mat);
		System.out.println("Column Wise Sum is ");
		for(int i=0;i<sum.length;i++)
		{
			System.out.print(sum[i]+" ");
		}
	}

	private static int[] columnWiseSum(int[][] mat) {
		int sum[]=new int[mat[0].length];
		for(int i=0;i<mat[0].length;i++)
		{
			int sm= 0;
			for(int j=0;j<mat.length;j++)
			{
					sm=sm+mat[j][i];
			}
			sum[i]=sm;
		}
		return sum;
	}
}
