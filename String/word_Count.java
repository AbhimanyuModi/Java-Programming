import java.util.Scanner;
public class word_Count
{
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Sentence ");
	String s=sc.nextLine();
	int count=0;
	for(int i=0;i<s.length();i++)
	{
	     char ch=s.charAt(i);
	     if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
		count++;
	}
	System.out.println("Number of Words are "+count);
    }
}