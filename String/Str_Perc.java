import java.util.Scanner;
public class Str_Perc 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String s=sc.next();
		double n=s.length();
		int count[]=new int[26];
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z')
				count[ch-65]++;
			else if(ch>='a' && ch<='z')
				count[ch-97]++;
		}
		for(int i=0;i<count.length;i++)
		{
			if(count[i]!=0)
			{
				 double d=count[i]/n*100;
				// System.out.printf((char)(i+65)+"--->%.2f\n",d);
				 System.out.println((char)(i+65)+"--->"+String.format("%.2f", d));
			}
		}
	}
}
