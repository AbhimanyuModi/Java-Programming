import java.util.Scanner;
public class Nearest_Multiple 
{
     public static void main(String[] args) 
     {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number ");
	int n=sc.nextInt();//67
	System.out.println("Enter divisor value ");
	int m=sc.nextInt();//8
	int r=n%m;//3
	int d1=n-r;//64
	int d2=d1+m;//72
	int r1=d2-n;//5
	if(r<r1)
	     System.out.println("Nearest Multiple of "+m+" is "+d1);
	else
	     System.out.println("Nearest Multiple of "+m+" is "+d2);
    }
}
