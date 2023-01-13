/*
  balanced ex. {}, {()}, {([])}
  not balanced ex.  {(}), }{, {}{
*/
package DSA_Project;
import java.util.Scanner;
import java.util.Stack;
public class String_Balance {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String st=sc.next();
		boolean rs=isBalanced(st);
		if(rs)
			System.out.println("Balanced");
		else
			System.out.println("Not Balanced");
	}

	public static boolean isBalanced(String st) {
		if(st.length()%2==1)
			return false;
		Stack<Character>stk=new Stack<Character>();
		for (int i = 0; i < st.length(); i++)
		{
			char ch=st.charAt(i);
			if(ch=='{' || ch=='(' || ch=='[')
				stk.push(ch);
			else
			{
				if(stk.isEmpty())
					return false;
				char pch=stk.pop();
				if(ch=='}' && pch!='{')
					return false;
				if(ch==')' && pch!='(')
					return false;
				if(ch==']' && pch!='[')
					return false;
			}
		}
		return stk.isEmpty();
	}
}
