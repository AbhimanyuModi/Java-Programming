import java.util.Scanner;
public class First_n_Fibbonacci
{
    static void printFib(int n)
    {
	int f1=0,f2=1;
	while(n>0)
	{
	    System.out.print(f1);
	    System.out.print(" ");
	    int f3=f1+f2;
	    f1=f2;
	    f2=f3;
	    n--;
	}
    }
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the range ");
	int n=sc.nextInt();
	System.out.println("First "+n+" Fibbonacci series is ");
	printFib(n);
    }
}