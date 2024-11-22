package Collection;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(100);
		a.add('A');
		a.add("str");
		a.add(null);
		a.add(200);
		a.add(2, 300);		
		System.out.println(a);
		ArrayList a1=new ArrayList(a);
		a1.add(500.5f);
		a1.add("did");
		System.out.println(a1.contains(600));
		Integer i=200;
		a1.remove(i);
		a1.retainAll(a);
		System.out.println(a1);
	}
}
