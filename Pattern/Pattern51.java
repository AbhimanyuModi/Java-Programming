/*
	*
      *   *
    *       *
  *           *
    *       *
      *   *
        *
*/import java.util.Scanner;
public class Pattern51
{
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the value of n ");
	int n=sc.nextInt();
	int sp=n/2,num=1;
	for(int i=1;i<=n;i++)
	{
	   for(int j=1;j<=sp;j++)
	   {
		System.out.print("  ");
	   }
	   for(int j=1;j<=num;j++)
	   {
		if(j==1 || j==num)
		    System.out.print("* ");
		else
		    System.out.print("  ");
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