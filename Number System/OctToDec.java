import java.util.Scanner;
public class OctToDec
{
    static int OctToDec(int oct)
    {
	int dec=0,pw=1;
	do
	{
	   int d=oct%10;
	   dec=dec+d*pw;
	   pw=pw*8;
	   oct=oct/10;
	}
	while(oct!=0);
	return dec;
    }
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
 	System.out.println("Enter Octal Value ");
	int n=sc.nextInt();
	int oct=OctToDec(n);
	System.out.println("Decimal equivalent is "+oct);
    }
}