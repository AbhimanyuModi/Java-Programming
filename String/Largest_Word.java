import java.util.Scanner;
public class Largest_Word
{
    private static String longestWord(String str)
    {
	String st[]=str.split(" ");
	String lw=st[0];
	for(int i=0;i<st.length;i++)
	{
	    if(st[i].length()>lw.length())
		lw=st[i];
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