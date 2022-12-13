import java.util.Scanner;
public class ThreeDigitNum
{
    public static void main(String args[])
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number ");
	int n=sc.nextInt();
	if(n>99 && n<1000 || n<-99 && n>-1000)
	{
	    System.out.println(n+" is three digit number");
	}
	else
	{
	    System.out.println(n+" is not three digit number");
	}
    }
}