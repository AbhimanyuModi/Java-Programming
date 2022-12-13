/*
	1
      1 * 2
    1 * 2 * 3
  1 * 2 * 3 * 4
    1 * 2 * 3
      1 * 2
	1
*/
import java.util.Scanner;
public class Pattern56
{
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of n ");
	int n=sc.nextInt();
	int sp=n/2, num=1;
	for(int i=1;i<=n;i++)
	{
	    for(int j=1;j<=sp;j++)
	    {
		System.out.print("  ");
	    }
	    for(int j=1;j<=num;j++)
	    {
		System.out.print(j+" ");
		if(j<num)
		   System.out.print("* ");
	    }
	    if(i<=n/2)
	    {
		sp--;
		num++;
	    }
	    else
	    {
		sp++;
		num--;
	    }
	    System.out.println();	
	}
    }
}