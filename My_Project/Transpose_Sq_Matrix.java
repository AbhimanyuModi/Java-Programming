package My_Project;
import java.util.Scanner;
public class Transpose_Sq_Matrix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of Rows ");
		int row=sc.nextInt();
		System.out.println("Enter number of Column ");
		int col=sc.nextInt();
		if(row==col)
		{
		   int mat[][]=new int[row][col];
		   System.out.println("Enter "+row*col+" elements Row Wise ");
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
		   mat=transpose(mat);
		   System.out.println("Transpose Matrix is ");
		   for(int i=0;i<mat.length;i++)
		   {
		    	for(int j=0;j<mat[i].length;j++)
			    {
				    System.out.print(mat[i][j]+" ");
			    }
			    System.out.println();
		   }
		}
		else
		{
			System.out.println("This does not follow Square Matrix Rule");
			System.out.println("Please Enter Same Value");
		}
	}

	private static int[][] transpose(int[][] mat) {
		for(int i=0;i<mat.length;i++)
		{
			for(int j=i;j<mat[i].length;j++)
			{
				int temp=mat[i][j];
				mat[i][j]=mat[j][i];
				mat[j][i]=temp;
			}
		}
		return mat;
	}
}
