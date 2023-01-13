package DSA_Project;

import javax.sound.sampled.ReverbType;

public class Singly_LinkedList_Main 
{
	public static void main(String[] args) 
	{
		Singly_LinkedList sl=new Singly_LinkedList();
		sl.add(85);
		sl.add(95);
		sl.add(75);
		sl.add(65);
		sl.add(45);
		System.out.println(sl);
		sl.addFirst(35);
		System.out.println(sl);
		System.out.println(sl.deleteFirst());
		System.out.println(sl.deleteLast());
		System.out.println(sl);
		
		sl.add(39,2);
		System.out.println(sl);
		
		sl.add(96,6); //out of Range
		System.out.println(sl);
		
		System.out.println(sl.delete(0));
		System.out.println(sl.delete(6)); //out of Range
		
		System.out.println(sl.search(34));
		System.out.println(sl);
		
		System.out.println(sl.middleData());
		
		System.out.println(sl.Sum());
		
		System.out.println("Reverse is ");
		sl.Reverse();
		System.out.println(sl);
		
	}
}
