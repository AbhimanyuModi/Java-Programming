//Without using split Method
import java.util.Scanner;
public class Largest_Word1
{
    private static String longestWord(String str)
    {
	String lw="";
	char ch[]=str.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
	    String w="";
	    while(i<ch.length && ch[i]!=' ')
	    {
		w=w+ch[i];
		i++;
	    }
	    if(w.length()>lw.length())
		lw=w;
	}
	return lw;
    }
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Sentence ");
	String s=sc.nextLine();
	String lw=longestWord(s);
	System.out.println(lw);
    }
}