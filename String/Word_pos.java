import java.util.Scanner;
public class Word_pos 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Sentence ");
		String s1=sc.nextLine();
		String str[]=s1.split("\\s");
		System.out.println("Enter the word to find its position in Sentence ");
		String s2=sc.next();
		for(int i=0;i<str.length;i++)
		{
			if(str[i].equalsIgnoreCase(s2))
				System.out.println(str[i]+"--->"+i);
		}
	}
}
