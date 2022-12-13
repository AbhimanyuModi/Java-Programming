/* Xylem number is a number whose extreme digit sum and mean digit sum is equal. ex. 121,363,2323 etc */
import java.util.Scanner;
public class XylemNumber
{
    static String isXylem(int x)
    {
	int es=0,ms=0;
	int d=x%10;
	es=es+d;
	x=x/10;
	while(x>9)
	{
	   d=x%10;
	   ms=ms+d;
	   x=x/10;
	}
	es=es+x;
	if(es==ms)
		return "Xylem";
	else
		return "Phleom";
    }
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number ");
	int n=sc.nextInt();
	String rs=isXylem(n);
	System.out.println(n+" is a "+rs+" number");
    }
}