import java.util.Scanner;
public class Word_Repeat_Count 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence ");
		String s=sc.nextLine();
		String str[]=s.split("\\s");
		word_Freq(str);
	}

	private static void word_Freq(String[] str) 
	{
		boolean b[]=new boolean[str.length];
		for(int i=0;i<str.length;i++)
		{
			if(b[i]==false)
			{
				int count=1;
				for(int j=i+1;j<str.length;j++)
				{
					if(str[i].equalsIgnoreCase(str[j]))
					{
						count++;
						b[j]=true;
					}	
				}
				System.out.println("Frequency of "+str[i]+"--->"+count);
			}
		}
	}
}
