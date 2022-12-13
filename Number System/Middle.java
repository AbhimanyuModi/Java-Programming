import java.util.Scanner;
public class Middle
{
    static int isBig(int a, int b, int c)
    {
	if(a>b && a>c)
	     return a;
	else if(b>c)
	     return b;
	else
	     return c;
    }
    static int isSmall(int a, int b, int c)
    {
	if(a<b && a<c)
	     return a;
	else if(b<c)
	     return b;
	else
	     return c;
    }
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1st number ");
	int a=sc.nextInt();
	System.out.println("Enter 2nd number ");
	int b=sc.nextInt();
	System.out.println("Enter 3rd number ");
	int c=sc.nextInt();
	int big=isBig(a,b,c);
	int small=isSmall(a,b,c);
	int m=(a+b+c)-(big+small);
	System.out.println("The Middle number "+m);
    }
}