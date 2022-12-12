package My_Project;
import java.util.Scanner;
public class MainEmployee
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many employees you have ");
		int n=sc.nextInt();
		Employee emps[]=new Employee[n];
		for( int i=0;i<n;i++)
		{
			System.out.println("Enter "+(i+1)+" employee information(id,name,sal) ");
			int id=sc.nextInt();
			sc.nextLine();
			String name=sc.nextLine();
			double sal=sc.nextDouble();
			emps[i]=new Employee(id,name,sal);
		}
		System.out.println("User entered employee information ");
		for(int i=0;i<emps.length;i++)
		{
			System.out.println(emps[i]);
		}
		Employee hs=getHighestSalary(emps);
		System.out.println("Highest Salary employee is ");
		System.out.println(hs);
	}
	private static Employee getHighestSalary(Employee[] es)
	{
		Employee hemp=es[0];
		for(int i=1;i<es.length;i++)
		{
			if(es[i].sal>hemp.sal)
				hemp=es[i];
		}
		return hemp;
	}
}
