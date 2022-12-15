import java.util.Scanner;
public class vowel_con_Count
{
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Sentence ");
	String s=sc.nextLine();
	int vc=0,cc=0;
	for(int i=0;i<s.length();i++)
	{
	    char ch=s.charAt(i);
	    if(ch>='A' && ch<='Z')
	    {
		if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
			vc++;
	   	 else
			cc++;
	    }
	    else if(ch>='a' && ch<='z')
	    {
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			vc++;
		else
			cc++;
	    }
	}
	System.out.println("Number of Vowels are "+vc);
	System.out.println("Number of Consonants are "+cc);
    }
}