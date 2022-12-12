package My_Project;
public class Main_Avg {
	public static void main(String[] args) {
		Avg_Array aa=new Avg_Array();
		int x[]=aa.readArray();
		System.out.println("User entered Array is ");
		aa.display(x);
		System.out.println();
		System.out.println("Avg of Array elements is "+aa.avgArray(x));
	}
}
