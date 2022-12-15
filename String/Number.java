import java.util.Scanner;
public class Number 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Amount ");
		int n=sc.nextInt();
		String s=printdigit(n);
		System.out.println(s);
	}

	private static String printdigit(int n) //1234567
	{
		String str=" ";
		String s[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
		while(n!=0)
		{
			int d=n%10;
			n=n/10;
			str=s[d]+" "+str;
		}
		return str;
	}
}
