package DSA_Project;
import java.util.Stack;
public class Main_Stack {
	public static void main(String[] args) {
		My_Stack ms=new My_Stack(5);
			ms.push(45);
			ms.push(67);
			ms.push(87);
			ms.push(54);
			ms.push(53);
			ms.push(98);
			System.out.println("Elements of Stack");	
			System.out.println(ms);
			System.out.println(ms.size());
			System.out.println(ms.pop());
			System.out.println(ms.pop());
			System.out.println(ms.pop());
			System.out.println(ms);
			ms.push(65);
			ms.push(39);
			System.out.println(ms);
			System.out.println(ms.peek());
			System.out.println("Thank You");
	}
}

