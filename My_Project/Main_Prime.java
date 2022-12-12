package My_Project;
public class Main_Prime {
 public static void main(String[] args) {
	Prime_Array pa=new Prime_Array();
	int x[]=pa.readArray();
	System.out.println("User entered Array is ");
	pa.display(x);
	System.out.println();
	System.out.println("Number of Prime number is "+pa.countPrime(x));
}
}
