package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1=new ArrayList();
		a1.add(102);
		a1.add("Success");
		a1.add('A');
		a1.add(20.5f);
		System.out.println(a1);
		ListIterator li=a1.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("------------");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
	}

}
