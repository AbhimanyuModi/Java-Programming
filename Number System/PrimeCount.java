import java.util.Scanner;
public class PrimeCount
{
    static int CountPrime(int x)
    {
	int Count=0;
	while(x!=0)
	{
	    int d=x%10;
	    if(d==2 || d==3 || d==5 || d==7)
	    {
	          Count++;
	    }
	    x=x/10;
	}
	return Count;
    }
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number ");
	int n=sc.nextInt();
	int p=CountPrime(n);
	System.out.println("Number of Prime digit in "+n+" is "+p);
    }
}