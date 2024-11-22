package CollectionPractice;

import java.util.LinkedList;
import java.util.Queue;

public class QueueElement {
	
	public static void main(String[] args)
	{
		Queue<String> q1= new LinkedList<>();
		q1.add("abc");
//		add the element
		q1.add("sneha");
		q1.add("xyz");
		
		System.out.println(q1);
//		peek the element
		
		System.out.println("peek "+ q1.peek()); 
		System.out.println(q1);
		
		System.out.println("Remove "+q1.remove());
		System.out.println(q1);
		
		System.out.println(q1.isEmpty());
		System.out.println(q1);
		
		System.out.println(q1.remove());
		System.out.println(q1);
		
		System.out.println(q1.remove());
		System.out.println(q1.isEmpty());
		
		q1.add("100");
		System.out.println(q1);
	}

}
