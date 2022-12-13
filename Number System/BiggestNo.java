import java.util.Scanner;
public class BiggestNo
{
    public static void main(String args[])
    {
  	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1st number= ");
	int a=sc.nextInt();
	System.out.println("Enter 2nd number= ");
	int b=sc.nextInt();
	System.out.println("Enter 3rd number= ");
	int c=sc.nextInt();
	int big=a;
	if(big<b)
	    big=b;
	if(big<c)
	    big=c;
	System.out.println("Biggest number is= "+big);
    }
       
}