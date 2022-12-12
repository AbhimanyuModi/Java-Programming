package My_Project;
import java.util.Scanner;
public class Matrix_Multiplication {
	public static void main(String[] args) {
		Matrix_Multiplication mm=new Matrix_Multiplication();
		System.out.println("Enter 1st Matrix ");
		int x[][]=mm.readMat();
		System.out.println("Enter 2nd Matrix ");
		int y[][]=mm.readMat();
		System.out.println("User entered 1st Matrix is ");
		mm.dispMat(x);
		System.out.println("User entered 2nd Matrix is ");
		mm.dispMat(y);
		if(x.length!=y[0].length || x[0].length!=y.length)
		{
			System.out.println("Not Possible to Multiplication");
		}
		else
		{
			int[][] z=mm.multiplyMatrix(x,y);
			System.out.println("Matrix Multiplication is ");
			mm.dispMat(z);
		}
	}
	private int[][] multiplyMatrix(int[][] a, int[][] b) 
	{
		
		int mat[][]=new int[a.length][b[0].length];
		{
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a.length;j++)
				{
					for(int k=0;k<b.length;k++)
					{
						mat[i][j]=mat[i][j]+a[i][k]*b[k][j];
					}
				}
			}
		}
		return mat;
	}
	public static int[][] readMat()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of Rows ");
		int row=sc.nextInt();
		System.out.println("Enter number of Column ");
		int col=sc.nextInt();
		int[][] mat=new int[row][col];
		System.out.println("Enter "+row*col+" elements Row Wise ");
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
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
}
