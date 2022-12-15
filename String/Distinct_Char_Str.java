import java.util.Scanner;
public class Distinct_Char_Str 
{	
    public static void main(String[] args) 
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1st String ");
	String s1=sc.next();
	char ch1[]=s1.toCharArray();
	System.out.println("Enter 2nd String ");
	String s2=sc.next();
	char ch2[]=s2.toCharArray();
	String ch=isDistinct(ch1,ch2);
	System.out.println(ch);
    }
    private static String isDistinct(char[] ch1, char[] ch2)//abcd,acd
    {
	boolean b[]=new boolean[ch1.length];
	boolean c[]=new boolean[ch2.length];
	String s="";
	for(int i=0;i<ch1.length;i++)
	{
	    for(int j=0;j<ch2.length;j++)
	    {
		if(ch1[i]==ch2[j])
		{
		    b[i]=true;
		    c[j]=true;
		}
	    }
	}
	for(int i=0;i<b.length;i++)
	{
			
	    if(b[i]==false)
	    s=s+ch1[i];
	}
	for(int i=0;i<c.length;i++)
	{
	    if(c[i]==false)
		s=s+ch2[i];
	}
	return s;
    }
}
