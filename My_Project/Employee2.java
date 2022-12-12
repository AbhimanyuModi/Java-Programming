package My_Project;
public class Employee2 {
	int id;
	String name;
	double sal;
	public Employee2(int id,String name,double sal)
	{
		super();
		this.id =  id;
		this.name = name;
		this.sal = sal;
	}
	public int hashCode()
	{
		//return name.hashCode();
		//return ((Double)sal).hashCode();
		return ((Integer)id).hashCode();
	}
	public boolean equals(Object obj)
	{
		return this.hashCode()==obj.hashCode();
	}
	@Override
	public String toString()
	{
		return this.id+","+this.name+","+this.sal;
	}
}
