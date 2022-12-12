package My_Project;
import java.util.Scanner;
public class Duplicate_Perc_Str
{
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String ");
	String s=sc.nextLine();
	int count[]=new int[26];
	for(int i=0;i<s.length();i++)
	{
	    char ch=s.charAt(i);
	    if(ch>='A' && ch<='Z')
	    {
		count[ch-65]++;
	    }
	    else if(ch>='a' && ch<='z')
	    {
		count[ch-97]++;
	    }
	}
	for(int i=0;i<count.length;i++)
	{
		double perc;
	    perc=count[i]*100/s.length();
	    if(count[i]!=0)
		    System.out.println((char)(i+65)+"----> "+perc);
	}
    }
}