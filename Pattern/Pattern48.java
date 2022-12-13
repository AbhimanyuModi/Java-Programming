/*
	4321234
	 32123
	  212
	   1
	  212
	 32123
	4321234

*/
import java.util.Scanner;
public class Pattern48
{
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of n ");
	int n=sc.nextInt();
	int sp=0,num=n;
	for(int i=1;i<=n;i++)
	{
	    for(int j=1;j<=sp;j++)
	    {
		System.out.print(" ");
	    }
	    int x=num/2+1;
	    for(int j=1;j<=num;j++)
	    {
		System.out.print(x+"");
		if(j<=num/2)
		    x--;
		else
		    x++;
	    }
	    if(i<=n/2)
	    {
		sp++;
		num=num-2;
	    }
	    else
	    {
		sp--;
		num=num+2;
	    }
	    System.out.println();
	}
    }
}
