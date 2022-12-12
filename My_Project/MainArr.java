package My_Project;

public class MainArr {
public static void main(String[] args) {
	ArrayOperation ao=new ArrayOperation();
	int  x[]=ao.readArray();
	System.out.println("User Entered Array is ");
	ao.display(x);
	System.out.println("Biggest value is "+ao.getBiggest(x));
	System.out.println("Smallest value is "+ao.getSmallest(x));
	System.out.println("Sum of Array elements is "+ao.sumOfArray(x));
}
}
