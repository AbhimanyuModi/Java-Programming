package My_Project;

public class Employee {
	int id;
	String name;
	double sal;
	public Employee(int id,String name,double sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	@Override
	public String toString()
	{
		return this.id+","+this.name+","+this.sal;
	}
}
