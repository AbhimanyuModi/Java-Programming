package My_Project;
public class Main_Reverse {
	public static void main(String[] args) {
		Reverse_Array ra=new Reverse_Array();
		int x[]=ra.readArray();
		System.out.println("User entered Array is ");
		ra.display(x);
		//ra.reverseArray(x);
		System.out.println("Reverse Array is ");
		ra.reverseArray(x);
		//ra.display(x);
	}
}
