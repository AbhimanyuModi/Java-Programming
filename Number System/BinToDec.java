import java.util.Scanner;
public class BinToDec
{
    static int binToDec(int bin)
    {
	int dec=0,pw=1;
	do
	{
	     int b=bin%10;
	     dec=dec+b*pw;
	     pw=pw*2;
	     bin=bin/10;
	}
	while(bin!=0);
  	return dec;
    }
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Binary number ");
	int bin=sc.nextInt();
	System.out.println("Decimal equivalent is "+binToDec(bin));
    }
}