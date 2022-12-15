import java.util.Scanner;
public class Str_Rev_Pos 
{
    public static void main(String[] args) 
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String ");
	String a=sc.next();
	String b="";
	System.out.println("Reverse String ");
	for(int i=a.length()-1;i>=0;i--)
	{
	    b=b+a.charAt(i);
	}
	System.out.println(b);
	int count=0;
	System.out.println("Number of character whose position is same ");
	for (int i = 0; i < a.length(); i++) 
	{
	    if(a.charAt(i)==b.charAt(i))
		  count++;
	}
	System.out.println(count);
   }
}
