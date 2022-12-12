package My_Project;
import java.util.Scanner;
public class Rotate90_Left_Matrix {
	public static void main(String[] args) {
		Rotate90_Left_Matrix rl=new Rotate90_Left_Matrix();
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
		rl.dispMat(mat);
		mat=rotate90Left(mat);
	    System.out.println("After 90 degree Left Rotation Matrix is ");
	    rl.dispMat(mat);
	}
	private static int[][] rotate90Left(int[][] mat) 
	{
		mat=transpose(mat);
	    columnWiseReverse(mat);
		return mat;
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
	public static int[][] transpose(int[][] mat)
	{
	         int a[][]=new int[mat[0].length][mat.length];
	         for(int i=0;i<mat.length;i++)
	         {
		         for(int j=0;j<mat[i].length;j++)
		         {
			         a[j][i]=mat[i][j];
		         }
	         }
	         return a;
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
