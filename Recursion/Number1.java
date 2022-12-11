import java.util.Scanner;
public class Number1
{
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number ");
	int n=sc.nextInt();
	display(n);
    }
    public static void display(int n)
    {
	System.out.println(n);
	if(n>1)
	     display(n-1);
    }
}