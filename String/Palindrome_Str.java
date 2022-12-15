import java.util.Scanner;
public class Palindrome_Str
{
    public static boolean isPalindrome(String str)
    {
	int i=0,j=str.length()-1;
	while(i<j)
	{
	    if(str.charAt(i)!=str.charAt(j))
	        return false;
		i++;
		j--;
	}
	return true;
    }
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String ");
	String s=sc.nextLine();
	boolean rs=isPalindrome(s);
	if(rs)
	    System.out.println("String is Palindrome");
	else
	    System.out.println("String is not Palindrome");

    }
}