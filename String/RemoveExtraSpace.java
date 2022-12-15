import java.util.Scanner;
public class RemoveExtraSpace
{
    static String removeExtraSpace(String str)
    {
	String rs="";
	char ch[]=str.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
	    int find=0;
	    while(i<ch.length && ch[i]!=' ')
	    {
	     	rs=rs+ch[i];
		i++;
		find=1;
	    }
	    if(find==1 && i<ch.length)
	  	rs=rs+" ";
	}
	return rs;
    }
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Sentence ");
	String s=sc.nextLine();
	s=removeExtraSpace(s);
	System.out.println(s);
    }
}