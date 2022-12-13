import java.util.Scanner;
public class Prime_Count
{
    static boolean Prime(int x)
    {
	for(int i=2;i<=x/2;i++)
	    if(x%i==0)
	    {
		return false;
	    }
	    return true;
    }
    static int primeCount(int n)
    {
	int Count=0;
	for(int i=2;i<=n;i++)
	{
	    boolean rs=Prime(i);
	    if(rs==true)
		Count++;
	}
	return Count;
    }
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number ");
	int n=sc.nextInt();
	int pc=primeCount(n);
	System.out.println("Prime number upto "+n+" is "+pc);
    }
}