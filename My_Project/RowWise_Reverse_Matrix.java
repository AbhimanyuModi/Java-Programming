package My_Project;
import java.util.Scanner;
public class RowWise_Reverse_Matrix {
	public static void main(String[] args) {
		RowWise_Reverse_Matrix rr=new RowWise_Reverse_Matrix();
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
		rr.dispMat(mat);
		mat=rowWiseReverse(mat);
		System.out.println("Row Wise Reverse Matrix is ");
	    rr.dispMat(mat);
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
	private static int[][] rowWiseReverse(int[][] mat) 
	{
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length/2;j++)
			{
				int t=mat[i][j];
				mat[i][j]=mat[i][mat[i].length-1-j];
				mat[i][mat[i].length-1-j]=t;
			}
		}
		return mat;
	}
}
