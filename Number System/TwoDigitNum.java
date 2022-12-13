import java.util.Scanner;
public class TwoDigitNum
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number= ");
	int n=sc.nextInt();
	if(n>9 && n<100 || n<-9 && n>-100)
	{
	   System.out.println(n+" is two digit number");
	}
	else
	{
	   System.out.println(n+" is not two digit number");
	}
   }
}