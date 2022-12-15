import java.util.Scanner;
public class Number1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount ");
		int n=sc.nextInt();//3012022
		String s=printDigit(n);
		System.out.println(s);
	}
	static String printDigit(int m)
	{
		String str="";
		String s[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
		String str_num=String.valueOf(m);
		char num_arr[]=str_num.toCharArray();
		for(int i=0;i<num_arr.length;i++)
		{
			int a=Character.getNumericValue(num_arr[i]);
			str+=s[a]+" ";
		}
		return str;
	}
}
