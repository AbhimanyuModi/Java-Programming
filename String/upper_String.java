import java.util.Scanner;
public class upper_String
{
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Sentence ");
	String s=sc.nextLine();
	System.out.println("Uppercase Sentence "+s.toUpperCase());
    }
}