package CollectionPractice;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> t1=new TreeSet<String>();
		t1.add("45");		
		t1.add("sneha");
		t1.add("A");
		t1.add("true");
		
		Iterator itr=t1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
