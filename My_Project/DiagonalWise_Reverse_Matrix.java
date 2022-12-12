package My_Project;
import java.util.Scanner;
public class DiagonalWise_Reverse_Matrix {
	public static void main(String[] args) {
		DiagonalWise_Reverse_Matrix dr=new DiagonalWise_Reverse_Matrix();
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
		dr.dispMat(mat);
		System.out.println("Diagonal Wise Reverse of Matrix ");
		dr.diagonalWise_Reverse(mat);
		dr.dispMat(mat);
	}
	private void diagonalWise_Reverse(int[][] mat) 
	{
		for(int i=0;i<mat.length/2;i++)
		{
			int t=mat[i][i];
			mat[i][i]=mat[mat.length-1-i][mat.length-1-i];
			mat[mat.length-1-i][mat.length-1-i]=t;
			t=mat[i][mat.length-1-i];
			mat[i][mat.length-1-i]=mat[mat.length-1-i][i];
			mat[mat.length-1-i][i]=t;
		}
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
}
