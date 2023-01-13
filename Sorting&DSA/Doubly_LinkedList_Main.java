package DSA_Project;
public class Doubly_LinkedList_Main 
{
	public static void main(String[] args) 
	{
		Doubly_LinkedList dl=new Doubly_LinkedList();
		dl.add(85);
		dl.add(95);
		dl.add(75);
		dl.add(65);
		dl.add(45);
		System.out.println(dl);
		dl.addFirst(35);
		System.out.println(dl);
		System.out.println(dl.deleteFirst());
		System.out.println(dl);
		System.out.println(dl.deleteLast());
		System.out.println(dl);
		dl.add(39,2);
		System.out.println(dl);
		
		dl.add(25,6); //out of Range
		System.out.println(dl);
		
		System.out.println(dl.delete(0));
		System.out.println(dl.delete(6)); // out of Range
		
		System.out.println(dl.Search(75));
		System.out.println(dl);
		
		System.out.println("Reverse is ");
		dl.Reverse();
		System.out.println(dl);
	}
}
