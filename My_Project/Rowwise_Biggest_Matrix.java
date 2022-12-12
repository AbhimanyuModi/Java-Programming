package My_Project;
import java.util.Scanner;
public class Rowwise_Biggest_Matrix {
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
		int big[]=rowWiseBiggest(mat);
		System.out.println("Row Wise Biggest element is ");
		for(int i=0;i<big.length;i++)
		{
			System.out.print(big[i]+" ");
		}
			
	}
	public static int[] rowWiseBiggest(int mat[][])
	{
		int big[]=new int[mat.length];
		for(int i=0;i<mat.length;i++)
		{
			int bg=mat[i][0];
			for(int j=1;j<mat[i].length;j++)
			{
				if(mat[i][j]>bg)
					bg=mat[i][j];
			}
			big[i]=bg;
		}
		return big;
	}
}
