/*
Pangram is a sentence which contains all the character of the Alphabets ignoring the case of Alphabets.Ex. The Quick brown fox jumps over the lazy dog
*/
import java.util.Scanner;
public class Pangram1
{
     public static void main(String[] args) 
     {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Sentence ");
	String s=sc.nextLine();
	s.toLowerCase();
	boolean rs=isPangram(s);
	if(rs)
	     System.out.println("String is Pangram");
	else
	     System.out.println("String is not Pangram");
     }
     public static boolean isPangram(String s)
     {
	if(s.length()<26)
	     return false;
	else
	{
	     for(char ch='a';ch<='z';++ch)
	     {
		 if(s.indexOf(ch)<0)
			return false;
	     }
	}
	return true;
    }
}
