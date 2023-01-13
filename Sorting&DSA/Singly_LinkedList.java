package DSA_Project;
public class Singly_LinkedList 
{
	class Node
	{
		Object data;
		Node next;
		Node(Object data)
		{
			this.data=data;
		}
	}
	private Node head;
	void add(Object ele)
	{
		Node n=new Node(ele);
		if(head==null)
		{
			head=n;
			return;
		}
		Node temp=head;
		while(temp.next!=null)
			temp=temp.next;
		temp.next=n;
	}
	@Override
	public String toString()
	{
		String st=" ";
		Node temp=head;
		while(temp!=null)
		{
			st=st+temp.data;
			if(temp.next!=null)
				st=st+"--->";
			temp=temp.next;
		}
		return st;
	}
	public void addFirst(Object ele)
	{
		Node n=new Node(ele);
		n.next=head;
		head=n;
	}
	public Object deleteFirst()
	{
		if(head==null)
			return "List is empty";
		Object ele=head.data;
		head=head.next;
		return ele;
	}
	public Object deleteLast()
	{
		if(head==null)
			return "List is empty";
		Node temp=head;
		Node tprev=null;
		while(temp.next!=null)
		{
			tprev=temp;
			temp=temp.next;
		}
		if(tprev==null)
			head=null;
		else
			tprev.next=null;
		return temp.data;
	}
	
	public void add(Object ele,int in)
	{
		if(in==0)
		{
			addFirst(ele);
			return;
		}
		Node temp=head;
		while(temp!=null && in>1)
		{
			temp=temp.next;
			in--;
		}
		if(in==1 && temp!=null)
		{
			Node n=new Node(ele);
			n.next=temp.next;
			temp.next=n;
		}
		else
			System.out.println("Index not in the Range");
	}
	
	public Object delete(int in)
	{
		if(in==0)
			return deleteFirst();
		Node temp=head;
		while(temp!=null && in>1)
		{
			temp=temp.next;
			in--;
		}
		if(temp==null || temp.next==null)
		{
			System.out.println("Index not in the Range");
			return null;
		}
		else
		{
			Node tn=temp.next;
			temp.next=tn.next;
			return tn.data;
		}
	}
	
	public int search(int ele)
	{
		int in=0;
		Node temp=head;
		while(temp!=null)
		{
			if((int)temp.data==ele)
				return in;
			in++;
			temp=temp.next;
		}
		return -1;
	}
	
	public Object middleData()
	{
		Node fast=head;
		Node slow=head;
		while(fast!=null && fast.next!=null)
		{
			fast=fast.next.next;
			slow=slow.next;
		}
		return slow.data;
	}
	
	public int Sum()
	{
		int sum=0;
		Node temp=head;
		while(temp!=null)
		{
			sum=sum+(int)temp.data;
			temp=temp.next;
		}
		return sum;
	}
	
	public void Reverse()
	{
		Node prev=null;
		Node curr=head;
		Node next=null;
		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		head=prev;
	}
}
