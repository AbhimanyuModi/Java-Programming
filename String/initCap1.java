import java.util.Scanner;
public class initCap1
{
    public static String initCap(String str)
    {
	char ch[]=str.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
	    if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ')
	    {
		if(ch[i]>='a' && ch[i]<='z')
		    ch[i]=(char)(ch[i]-32);
	    }
	    else if(ch[i]>='A' && ch[i]<='Z')
	    { 	
		ch[i]=(char)(ch[i]+32);
	    }
	}
	return new String(ch);

    }
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String ");
	String s=sc.nextLine();
	s=initCap(s);
	System.out.println(s);
    }
}