package My_Project;
import java.util.Scanner;
public class ColumnWise_Reverse_Matrix {
	public static void main(String[] args) {
		ColumnWise_Reverse_Matrix cr=new ColumnWise_Reverse_Matrix();
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
		cr.dispMat(mat);
		mat=columnWiseReverse(mat);
		System.out.println("Column Wise Reverse Matrix is ");
	    cr.dispMat(mat);
	}
	public static void dispMat(int[][] mat)
	{
	    for(int i=0;i<mat.length;i++)
	    {
	        for(int j=0;j<mat[i].length;j++)
	        {
		       System.out.print(mat[i][j]+" ");
	        }
	        System.out.println();
	    }
	}
	private static int[][] columnWiseReverse(int[][] mat) 
	{
		for(int i=0;i<mat.length/2;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				int t=mat[i][j];
				mat[i][j]=mat[mat.length-1-i][j];
				mat[mat.length-1-i][j]=t;
			}
		}
		return mat;
	}
}

