import java.util.Scanner;
public class Reverse_Str
{
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Sentence ");
	String s=sc.nextLine();
	char ch[]=s.toCharArray();
	String str="";
	for(int i=0;i<ch.length;i++)
	{
	     int f=i;
	     while(i<ch.length && ch[i]!=' ')
	     {
		i++;
	     }
	     int l=i-1;
	     while(l>=f)
	     {
		str=str+ch[l];
		l--;
	     }
	     if(i<ch.length)
		str=str+ch[i];
	}
	s=new String(str);
	System.out.println(s);
    }
}