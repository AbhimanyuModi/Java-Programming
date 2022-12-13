/*
	1     2
	 3   5
	  8 13
	   21
*/
import java.util.Scanner;
public class Pattern60
{
    public static void main(String[] args) 
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of Rows ");
	int n=sc.nextInt();
	int f1=1,f2=2,f3;
	int sp=2*n-1, fp=1;
	for(int i=1;i<=n;i++)
	{
	    for(int j=1;j<=sp;j++)
	    {
		if(j==fp || j==sp)
		{
		    System.out.print(f1);
		    f3=f1+f2;
		    f1=f2;
		    f2=f3;
		}
		else
		{
		    System.out.print(" ");
		}
	    }
	    System.out.println();
	    sp--;
	    fp++;
	}
    }
}
