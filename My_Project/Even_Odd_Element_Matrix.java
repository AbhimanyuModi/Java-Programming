package My_Project;
import java.util.Scanner;
public class Even_Odd_Element_Matrix {
	public static void main(String[] args) 
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
		System.out.println("User entered Matrix is ");
		for(int i=0;i<mat.length;i++)
		{
		    for(int j=0;j<mat[i].length;j++)
		    {
			System.out.print(mat[i][j]+" ");
		    }
		    System.out.println();
		}
		countEOMat(mat);
	}
	public static void countEOMat(int mat[][])
	{
		int even=0,odd=0;
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				if(mat[i][j]%2==0)
					even++;
				else
					odd++;
			}
		}
		System.out.println("Even element is "+even);
		System.out.println("Odd element is "+odd);
	}
}
