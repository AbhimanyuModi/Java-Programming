import java.util.Scanner;
public class noOfCharacter_Word
{
    private static void noOfCharWord(String str)
    {
	char ch[]=str.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
	    String w="";
	    while(i<ch.length && ch[i]!=' ')
	    {
		w=w+ch[i];
		i++;
	    }
	   System.out.println(w+"----> "+w.length());
	}
    }
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Sentence ");
	String s=sc.nextLine();
	noOfCharWord(s);
    }
}