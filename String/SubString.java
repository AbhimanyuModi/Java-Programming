import java.util.Scanner;
public class SubString 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String ");
		String s=sc.next();
		int n=s.length();
		int count=0;
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				count++;
			}
		}
		System.out.println(count+n);
	}
}
