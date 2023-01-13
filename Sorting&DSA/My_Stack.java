package DSA_Project;
public class My_Stack {
	int capacity,top=-1;
	Object stk[];
	public My_Stack(int capacity)
	{
		this.capacity=capacity;
		stk=new Object[capacity];
	}
	public void push(Object ele)
	{
		if(top==capacity-1)
		{
			System.out.println("Stack Overflow");
			return;
		}
		stk[++top]=ele;
	}
	public String toString()
	{
		String st="[";
		for(int i=0;i<=top;i++)
		{
			st=st+stk[i]+" ";
		}
		return st+"]";
	}
	public int size()
	{
		return top+1;
	}
	public Object pop()
	{
		if(top==-1)
		{
			System.out.println("Stack Underflow");
			return "";
		}
		return stk[top--];
	}
	public Object peek()
	{
		if(top==-1)
		{
			System.out.println("Stack Underflow");
			return "";
		}
		return stk[top];
	}
}

