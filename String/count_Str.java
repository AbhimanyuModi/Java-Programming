import java.util.Scanner;

public class count_Str 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int lc=0,uc=0,n=0,sp=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='a' && ch<='z')
				lc++;
			else if(ch>='A' && ch<='Z')
				uc++;
			else if(ch>='0' && ch<='9')
				n++;
			else
				sp++;
		}
		System.out.println("Number of Upper Case "+uc);
		System.out.println("Number of Lower Case "+lc);
		System.out.println("Number of Digit "+n);
		System.out.println("Number of Special Char "+sp);
	}
}
