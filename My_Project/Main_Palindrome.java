package My_Project;
public class Main_Palindrome {
	public static void main(String[] args) {
		Palindrome_Array pa=new Palindrome_Array();
		int x[]=pa.readArray();
		System.out.println("User entered Array is ");
		pa.display(x);
		System.out.println();
		System.out.println("Number of Palindrome number is "+pa.countPalindrome(x));
	}
}
