package DSA_Project;
import java.util.Arrays;
public class My_Queue 
{
	private int front,rear,capacity;
	private Object obj[];
	public My_Queue(int Capacity)
	{
		this.capacity=Capacity;
		front=rear=-1;
		obj=new Object[capacity];
	}
	public void enQueue(Object ele)
	{
		if(rear==capacity-1)
		{
			System.out.println("Queqe is full");
			return;
		}
		if(front==-1)
			front=0;
		obj[++rear]=ele;
	}
	public Object deQueqe()
	{
		if(front==-1)
		{
			System.out.println("Queqe is empty");
			return null;
		}
		Object ele=obj[front++];
		if(front>rear)
			front=rear=-1;
		return ele;
	}
	public String toString()
	{
		String st="[";
		for(int i=front;i<=rear;i++)
		{
			st=st+obj[i]+" ";
		}
		return st+"]";
		// return Arrays.toString(Arrays.copyOfRange(obj, front, rear+1));
	}
	public int size()
	{
		if(front==-1)
			return 0;
		return rear-front+1;
	}
}
