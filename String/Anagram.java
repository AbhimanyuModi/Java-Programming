/*
Anagram of a String is another String that contains the same characters,only the order of character can be different. Ex.Listen-Silent, Mother in Law-Hitler Woman, Debit Card-Bad Credit,keep-peek etc
*/
import java.util.Scanner;
public class Anagram
{
    private static boolean isAnagram(String str1,String str2)
    {
	int c1[]=countFreq(str1);
	int c2[]=countFreq(str2);
	for(int i=0;i<26;i++)
	{
	    if(c1[i]!=c2[i])
		return false;
	}
	return true;
    }
    private static int[] countFreq(String str)
    {
	int count[]=new int[26];
	for(int i=0;i<str.length();i++)
	{
	    char ch=str.charAt(i);
	    if(ch>='A' && ch<='Z')
	    {
		count[ch-65]++;
	    }
	    else if(ch>='a' && ch<='z')
	    {
		count[ch-97]++;
	    }
	}
	return count;
    }
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1st String ");
	String s1=sc.nextLine();
	System.out.println("Enter 2nd String ");
	String s2=sc.nextLine();
	boolean rs=isAnagram(s1,s2);
	if(rs)
	     System.out.println("Strings are Anagram");
	else
	     System.out.println("Strings are not Anagram");
    }
}