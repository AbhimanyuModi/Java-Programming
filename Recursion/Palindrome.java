import java.util.Scanner;
public class Palindrome
{
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number ");
	int n=sc.nextInt();
	boolean rs=isPalindrome(n);
	if(rs)
	    System.out.println("Palindrome number");
	else
	    System.out.println("Non Palindrome number");
    }
    public static boolean isPalindrome(int n)
    {
	return isPalindrome(n,0,n);
    }
    public static boolean isPalindrome(int x,int rev,int temp)
    {
	if(x==0)
	      return rev==temp;
	return isPalindrome(x/10,rev*10+x%10,temp);
    }
}