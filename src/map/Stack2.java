package map;

import java.util.Enumeration;
import java.util.Stack;

public class Stack2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Stack<String> st=new Stack();
        st.push("main");
        st.push("show");
        st.push("xyz");
        st.push("abc");
        
        Enumeration<String> en=st.elements();
        while(en.hasMoreElements())
        {
        	String str=en.nextElement();
        	System.out.println(str);
        }
        System.out.println("peek the head element from stack---"+st.peek());
        System.out.println(st.remove("main"));
        System.out.println(st.remove(1));
        System.out.println(st.pop());
        System.out.println(st.pop());
	}

}
