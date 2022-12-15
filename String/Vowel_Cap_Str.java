import java.util.Scanner;
public class Vowel_Cap_Str 
{
   public static void main(String[] args) 
   {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Sentence ");
	String s=sc.nextLine();
	char ch[]=s.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
	   if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o'|| ch[i]=='u')
	   {
		ch[i]=(char)(ch[i]-32);
	   }
	   else if(ch[i]>='A' && ch[i]<='Z')
	   {
		if(ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O'|| ch[i]=='U')
		      ch[i]=(char)(ch[i]+0);
		else
		      ch[i]=(char)(ch[i]+32);
	   }
	}
	s=new String(ch);
	System.out.println(s);
   }
}
