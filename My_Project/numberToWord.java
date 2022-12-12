package My_Project;
import java.util.Scanner;
public class numberToWord {
	static void noToWord(int x,String st)
	{
		String fn[]= {"","One ","Two ","Three ","Four ","Five ","Six ","Seven ","Eight ","Nine ","Ten ","Eleven ","Twelve ","Thirteen ","Fourteen ","Fifteen ","Sixteen ","Seventeen ","Eighteen ","Nineteen "};
		String sn[]= {"","","Twenty ","Thirty ","Forty ","Fifty ","Sixty ","Seventy ","Eighty ","Ninty "};
		if(x<20)
			System.out.print(fn[x]);
		else
			System.out.print(sn[x/10]+fn[x%10]);
		if(x!=0)
			System.out.print(st+" ");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Amount ");
		int n=sc.nextInt();
		noToWord(n/10000000,"Crore");
		noToWord(n/100000%100,"Lakh");
		noToWord(n/1000%100,"Thousand");
		noToWord(n/100%10,"Hundred");
		noToWord(n%100," ");
	}
}
