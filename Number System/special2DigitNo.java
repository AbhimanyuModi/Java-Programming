import java.util.Scanner;
public class special2DigitNo
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Two Digit Number= ");
	int n=sc.nextInt();
	int x=n/10;
	int y=n%10;
	int z=x+y+x*y;
	if(z==n)
	   System.out.println(n +" is special two digit no.");
	else
	   System.out.println(n +" is not special two digit no.");
   }
}