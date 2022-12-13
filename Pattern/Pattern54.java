/*
	1
      0 0 0
    1 1 1 1 1
  0 0 0 0 0 0 0
    1 1 1 1 1
      0 0 0
        1
*/
import java.util.Scanner;
public class Pattern54
{
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the value of n ");
	int n=sc.nextInt();
	int sp=n/2,num=1,k=1;
	for(int i=1;i<=n;i++)
	{
	
	   for(int j=1;j<=sp;j++)
	   {
		System.out.print("  ");
	   }
	   for(int j=1;j<=num;j++)
	   {
		System.out.print(k%2+" ");
	   }
	   if(i<=n/2)
	   {
		sp--;
		num=num+2;
		k++;
	   }
	   else
	   {
		sp++;
		num=num-2;
		k--;
	   }
	   System.out.println();
	}
    }
}