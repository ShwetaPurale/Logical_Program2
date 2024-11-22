package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		a.add(100);
		a.add(200);
		a.add(300);
        a.add("str");
        a.add('X');
        a.add(20.5f);
        System.out.println(a);
        a.remove(1);
//      Iterator i=a.iterator();
        ListIterator i=a.listIterator();
        while(i.hasNext())
        {
//        	i.remove();
//        	i.add(20);
           	System.out.println(i.next());
        }
	}
}
