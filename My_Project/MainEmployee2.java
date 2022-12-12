package My_Project;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
public class MainEmployee2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		HashSet<Employee2> elist = new HashSet<Employee2>();
		while (true) 
		{
			System.out.println("Enter employee information(id,name & salary) ");
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.next();
			double sal = sc.nextDouble();
			Employee2 emp = new Employee2(id, name, sal);
			elist.add(emp);
			System.out.println("Do you have more employee ");
			String st = sc.next();
			if (st.equalsIgnoreCase("no"))
				break;
		}
		System.out.println("User entered employee information ");
		for (Employee2 emp : elist) 
		{
			System.out.println(emp);
		}
		Employee2 hs = getHighestSalary(elist);
		System.out.println("Highest salary employee is ");
		System.out.println(hs);
	}

	private static Employee2 getHighestSalary(HashSet<Employee2> es) 
	{
		Iterator<Employee2> it = es.iterator();
		Employee2 hemp = null;
		while(it.hasNext()) {
		hemp =  it.next();
		for (int i = 1; i < es.size(); i++) 
		{
			if ((it.next()).sal > hemp.sal)
				hemp = it.next();
		}
		
		}
		return hemp;
	}
}

