import java.util.Scanner;
public class MainSpecial
{
    //n is formal parameter
    static boolean isSpecial(int n)  //Called Method

    {
	int d1=n/10;
	int d2=n%10;
	int sum=d1+d2+d1*d2;
	if(sum==n)
	    return true;
	else
	    return false;
    }
    public static void main(String[] args)
    {
	boolean rs=isSpecial(45);  //Calling Statement
	if(rs==true)
	     System.out.println("45 is special two digit number");
	else
	     System.out.println("45 is not special two digit number");

	rs=isSpecial(89);  //Calling Statement
	if(rs==true)
	     System.out.println("89 is special two digit number");
	else
	     System.out.println("89 is not special two digit number");
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two digit number ");
	int n=sc.nextInt();

	rs=isSpecial(n);  //Calling Statement
	if(rs==true)
	     System.out.println(n+" is special two digit number");
	else
	     System.out.println(n+" is not special two digit number");	
    }
}