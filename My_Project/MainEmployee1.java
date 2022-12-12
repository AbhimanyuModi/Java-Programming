package My_Project;
import java.util.ArrayList;
import java.util.Scanner;
public class MainEmployee1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee1> elist = new ArrayList<Employee1>();
		while (true) {
			System.out.println("Enter employee information(id,name & salary) ");
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			double sal = sc.nextDouble();
			Employee1 emp = new Employee1(id, name, sal);
			elist.add(emp);
			System.out.println("Do you have more employee ");
			String st = sc.next();
			if (st.equalsIgnoreCase("no"))
				break;
		}
		System.out.println("User entered employee information ");
		for (Employee1 emp : elist) {
			System.out.println(emp);
		}
		Employee1 hs = getHighestSalary(elist);
		System.out.println("Highest salary employee is ");
		System.out.println(hs);
	}

	private static Employee1 getHighestSalary(ArrayList<Employee1> es) {
		Employee1 hemp = es.get(0);
		for (int i = 1; i < es.size(); i++) {
			if (es.get(i).sal > hemp.sal)
				hemp = es.get(i);
		}
		return hemp;
	}
}
