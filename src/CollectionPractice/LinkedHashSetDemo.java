package CollectionPractice;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet h1=new LinkedHashSet();
		h1.add(250);
		h1.add(25.5f);
		h1.add("abc");
		h1.add('a');
		
		LinkedHashSet h2=new LinkedHashSet();
		h2.add(50);
		h2.addAll(h1);
		
		Iterator itr=h2.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
