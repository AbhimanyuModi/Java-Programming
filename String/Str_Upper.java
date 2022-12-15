import java.util.Scanner;
public class Str_Upper
{
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String ");
	String s=sc.nextLine();
	char ch[]=s.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
	    if(ch[i]>='a' && ch[i]<='z')
	    {
		ch[i]=(char)(ch[i]-32); //a(97)-A(65)=32
	    }
	}
	s=new String(ch);
	System.out.println(s);
    }
}