import java.util.Scanner;
public class Palindrome_Str
{
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String ");
	String s=sc.next();
	boolean rs=isPalindrome(s);
	if(rs)
	     System.out.println(s+" is Palindrome String");
	else
	     System.out.println(s+" is not Palindrome String");
    }
    public static boolean isPalindrome(String s)
    {
	return isPalindrome(s,0,s.length()-1);
    }
    public static boolean isPalindrome(String str,int i,int j)
    {
	if(i>=j)
	     return true;
	if(str.charAt(i)!=str.charAt(j))
	     return false;
	return isPalindrome(str,i+1,j-1);
    }
}