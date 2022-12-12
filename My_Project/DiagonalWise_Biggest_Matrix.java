package My_Project;
import java.util.Scanner;
public class DiagonalWise_Biggest_Matrix {
	public static void main(String[] args) {
		DiagonalWise_Biggest_Matrix db=new DiagonalWise_Biggest_Matrix();
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
		db.dispMat(mat);
		int sum[]=diagonalBiggest(mat);
		System.out.println("Diagonal Biggest element of Matrix is ");
		for(int i=0;i<sum.length;i++)
		{
			System.out.print(sum[i]+" ");
		}
	}
	private static int[] diagonalBiggest(int[][] mat) 
	{
		int pbig=mat[0][0],sbig=mat[0][mat.length-1];
		for(int i=1;i<mat.length;i++)
		{
			if(mat[i][i]>pbig)
				pbig=mat[i][i];
			if(mat[i][mat.length-1-i]>sbig)
				sbig=mat[i][mat.length-1-i];
		}
		return new int[] {pbig,sbig};
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
