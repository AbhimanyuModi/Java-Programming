package My_Project;
import java.util.Scanner;
public class Matrix_Addition {
	public static void main(String[] args) 
	{
		Matrix_Addition ma=new Matrix_Addition();
		System.out.println("Enter 1st Matrix ");
		int x[][]=ma.readMat();
		System.out.println("Enter 2nd Matrix ");
		int y[][]=ma.readMat();
		System.out.println("User entered 1st Matrix is ");
		ma.dispMat(x);
		System.out.println("User entered 2nd Matrix is ");
		ma.dispMat(y);
		int z[][]=ma.addMat(x, y);
		if(z==null)
			System.out.println("Addition Failed");
		else
		{
			System.out.println("Added Matrix is ");
			ma.dispMat(z);
		}
	}
	public static int[][] readMat()
	{
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
	public static int[][] addMat(int[][] a,int[][] b)
	{
		if(a.length!=b.length || a[0].length!=b[0].length)
		{
			System.out.println("Order must be same");
			return null;
		}
		int c[][]=new int[a.length][a[0].length];
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		return c;
	}
	
}
