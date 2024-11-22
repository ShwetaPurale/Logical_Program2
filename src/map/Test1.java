package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> mapOfStud=new HashMap();
		mapOfStud.put(10, "abc");
		mapOfStud.put(20, "xyz");
		mapOfStud.put(50, "pqr");
		mapOfStud.put(40, "srt");
		mapOfStud.put(30, "mno");
		
		Collection<String> value=mapOfStud.values();
		System.out.println(value);
		
		Set<Integer> roll=mapOfStud.keySet();
		Iterator<Integer> itr=roll.iterator();
		while(itr.hasNext())
		{
			int rollNo=itr.next();
			String name=mapOfStud.get(rollNo);
			System.out.println(rollNo+"----"+name);
		}

	}

}
