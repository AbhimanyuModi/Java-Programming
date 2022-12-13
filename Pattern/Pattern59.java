/*      *                 *
        * *             * *
        * * *         * * *
        * * * *     * * * *
        * * * * * * * * * * 
*/
import java.util.Scanner;
public class Pattern59
{
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of n ");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{
	    for(int j=1;j<=2*n;j++)
	    {
		if(i>=j)
		{
		    System.out.print("*");
		}
		else
		{
		    System.out.print(" ");
		}
		if(i>2*n-j)
		{
		    System.out.print("*");
		}
		else
		{
		    System.out.print(" ");
		}
	    }
	    System.out.println();
	}
    }
}