package My_Project;
import java.util.Scanner;
public class ColumnWise_Biggest_Matrix {
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
		int big[]=columnWiseBiggest(mat);
		System.out.println("Column Wise Biggest element is ");
		for(int i=0;i<big.length;i++)
		{
			System.out.print(big[i]+" ");
		}
			
	}
	public static int[] columnWiseBiggest(int mat[][])
	{
		int big[]=new int[mat[0].length];
		for(int i=0;i<mat[0].length;i++)
		{
			int bg=mat[0][i];
			for(int j=1;j<mat.length;j++)
			{
				if(mat[j][i]>bg)
					bg=mat[j][i];
			}
			big[i]=bg;
		}
		return big;
	}
}

