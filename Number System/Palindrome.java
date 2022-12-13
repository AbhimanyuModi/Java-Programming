import java.util.Scanner;
public class Palindrome
{
   static boolean isPalindrome(int x)
   {
	int rev=0,temp=x;
	while(x!=0)
	{
	   int d=x%10;
	   rev=rev*10+d;
	   x=x/10;
	}
	if(rev==temp)
	   return true;
	else
	   return false;
   }
   public static void main(String[] args)
   {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number ");
	int n=sc.nextInt();
	boolean rs=isPalindrome(n);
	if(rs==true)
	    System.out.println(n+" is Palindrome number");
	else
	    System.out.println(n+" is not a Palindrome number");
   }
}