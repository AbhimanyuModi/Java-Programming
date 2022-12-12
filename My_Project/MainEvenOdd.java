package My_Project;
public class MainEvenOdd {
	public static void main(String[] args) {
		Even_Odd_Array eo=new Even_Odd_Array();
		int x[]=eo.readArray();
		System.out.println("User entered Array is ");
		eo.display(x);
		System.out.println("Number of Even number "+eo.countEven(x));
		System.out.println("Number of Odd number "+eo.countOdd(x));
	}
}
