import java.util.Scanner;
public class Smallest_Word
{
    private static String smallestWord(String str)
    {
	String sw=str;
	char ch[]=str.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
	    String w="";
	    while(i<ch.length && ch[i]!=' ')
	    {
		w=w+ch[i];
		i++;
	    }
	    if(w.length()<sw.length())
		sw=w;
	}
	return sw;
    }
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Sentence ");
	String s=sc.nextLine();
	String sw=smallestWord(s);
	System.out.println(sw);
    }
}