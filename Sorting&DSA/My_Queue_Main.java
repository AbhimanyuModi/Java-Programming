package DSA_Project;
public class My_Queue_Main 
{
	public static void main(String[] args) 
	{
		My_Queue q=new My_Queue(6);
		q.enQueue(45);
		q.enQueue(85);
		q.enQueue(89);
		System.out.println(q.deQueqe());
		System.out.println(q);
		System.out.println(q.size());
	}
}
