import java.util.Scanner;
public class Number
{
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number ");
	int n=sc.nextInt();
	System.out.println("MMS");
	display(n);
	System.out.println("MME");
    }
    public static void display(int n)
    {
	if(n>1)
	    display(n-1);
	System.out.println(n);
    }
}