import java.util.Scanner;
public class Reverse_Word_Str
{
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Sentence ");
	String s=sc.nextLine();
	char ch[]=s.toCharArray();
	String str="";
	for(int i=ch.length-1;i>=0;i--)
	{
	     int f=i;
	     while(i>=0 && ch[i]!=' ')
	     {
		i--;
	     }
	     int l=i+1;
	     while(l<=f)
	     {
		str=str+ch[l];
		l++;
	     }
	     if(i>=0)
		str=str+ch[i];
	}
	System.out.println(str);
    }
}