package My_Project;
public class Main_Array_DgtSum {
	public static void main(String[] args) {
		Array_DgtSum ad=new Array_DgtSum();
		int x[]=ad.readArray();
		System.out.println("User entered Array is ");
		ad.display(x);
		System.out.println();
		System.out.println("Replaced Array is ");
		ad.replaceByDgtSum(x);
	}
}