/*
	  1
         121
        12321
       1234321
        12321
         121
          1

*/
import java.util.Scanner;
public class Pattern47
{
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of n ");
	int n=sc.nextInt();
	int sp=n/2,num=1;
	for(int i=1;i<=n;i++)
	{
	    for(int j=1;j<=sp;j++)
	    {
		System.out.print(" ");
	    }
	    int x=1;
	    for(int j=1;j<=num;j++)
	    {
		System.out.print(x+"");
		if(j<=num/2)
		    x++;
		else
		    x--;
	    }
	    if(i<=n/2)
	    {
		sp--;
		num=num+2;
	    }
	    else
	    {
		sp++;
		num=num-2;
	    }
	    System.out.println();
	}
    }
}
