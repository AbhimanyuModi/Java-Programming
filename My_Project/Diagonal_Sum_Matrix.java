package My_Project;
import java.util.Scanner;
public class Diagonal_Sum_Matrix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of Rows ");
		int row=sc.nextInt();
		System.out.println("Enter number of Columns ");
		int col=sc.nextInt();
		if(row==col)
		{
		    int[][]mat=new int[row][col];
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
		  int[] s=diagonal_Sum(mat);
		  System.out.println("Diagonal Sum is ");
		  for(int i=0;i<s.length;i++)
		  {
			 System.out.print(s[i]+" ");
		  }
		}
		else
		{
			System.out.println("Please Enter Same Value");
		}
	}

	private static int[] diagonal_Sum(int[][] mat) 
	{
		int psum=0,ssum=0;
		for(int i=0;i<mat.length;i++)
		{
			psum=psum+mat[i][i];
			ssum=ssum+mat[i][mat.length-1-i];
		}
		return new int[] {psum,ssum};
	}
}
