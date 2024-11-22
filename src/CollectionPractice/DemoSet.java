package CollectionPractice;

import java.util.HashSet;
import java.util.Iterator;

public class DemoSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashSet s1=new HashSet();
//		s1.add("A");
//		s1.add(100);
//		s1.add(45.5f);
//		s1.add(false);
//		s1.add('b');
//		
//		System.out.println(s1);
//		
//		HashSet s2=new HashSet();
//		s2.add(100);
//		s2.add(52);
//		s2.add(200);
//		s2.add(52);
//		System.out.println(s2);
		
		HashSet<String> s3=new HashSet<String>();
		s3.add("abc");
		s3.add("xyz");
		s3.add("sharma");
		s3.add("kiran");
		
//		for(String s:s3)
//		{
//			System.out.println(s);
//		}
		
		Iterator<String> itr=s3.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
