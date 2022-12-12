package My_Project;
import java.util.Scanner;
public class Transpose_Matrix
{
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
}
