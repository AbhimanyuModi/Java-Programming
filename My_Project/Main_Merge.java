package My_Project;
public class Main_Merge {
	public static void main(String[] args) {
		Merge_Array ma=new Merge_Array();
		System.out.println("Enter the first Array elements ");
		int x[]=ma.readArray();
		System.out.println("User entered first Array is ");
		ma.display(x);
		System.out.println();
		System.out.println("Enter the second Array elements ");
		int y[]=ma.readArray();
		System.out.println("User entered second Array is ");
		ma.display(y);
		int z[]=ma.merge(x,y);
		System.out.println();
		System.out.println("After merge ");
		ma.display(z);
	}
}
