package map;

import java.util.List;
import java.util.Stack;

public class stack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Integer> stack=new Stack();
		Stack<Integer> stack=new Stack();
		stack.push(100);
		stack.push(200);
		stack.push(500);
		stack.push(600);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}

}
