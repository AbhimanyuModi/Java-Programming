import java.util.Scanner;
public class Fibbonacci
{
    static void Fibbonacci(int x)
    {
	int f0=0,f1=1,f2;
	while(f0<=x)
	{
	     System.out.print(f0+" ");
	     f2=f0+f1;
	     f0=f1;
	     f1=f2;
	}
    }
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number upto check Fibbonacci ");
	int n=sc.nextInt();
	System.out.println("Fibbonacci Series is");
	Fibbonacci(n);
    }
}