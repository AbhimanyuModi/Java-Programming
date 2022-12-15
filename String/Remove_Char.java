import java.util.Scanner;
public class Remove_Char 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String s=sc.nextLine();//abcd
		System.out.println("Enter the Character which we want to Remove ");
		String c=sc.nextLine();//a
		char ch=c.charAt(0);
		remove(s,ch);
	}
	private static void remove(String s, char c) 
	{
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch!=c)
			{
				System.out.print(ch);
			}
		}
		
	}
}
