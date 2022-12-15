import java.util.Scanner;
public class Encrypt_Str {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String s=sc.nextLine();
		s.toLowerCase();
		System.out.println("Enter key value ");
		int n=sc.nextInt();
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]+n<26+97)
				ch[i]=(char)(ch[i]+n);
			else
				ch[i]=(char)(ch[i]+n-26);
		}
		String st=new String(ch);
		System.out.println(st);
	}
}
