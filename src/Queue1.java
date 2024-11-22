import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Queue<String> q1=new LinkedList();
        q1.offer("Cyber");
        q1.offer("Success");
        q1.offer("Training");
        q1.offer("Institude");
        System.out.println(q1);
        System.out.println("***********");
        System.out.println(q1.peek());
//        peek and remove the head element from queue
        System.out.println(q1.poll());
//        After removing i am peek the object.
        System.out.println(q1.peek());
        System.out.println("********");
        for(String str:q1)
        {
        	System.out.println(str);
        }
	}

}
