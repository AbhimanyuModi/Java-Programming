package My_Project;

public class Employee1 {
	int id;
	String name;
	double sal;
	public Employee1(int id,String name,double sal)
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

