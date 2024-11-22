package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class set1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Set<Integer> s1=new HashSet();
          s1.add(48);
          s1.add(25);
          s1.add(84);
          s1.add(31);
          
          Iterator it=s1.iterator();
          while(it.hasNext())
          {
        	  Integer s=(Integer) it.next();
        	  System.out.println(s);
          }
          
          System.out.println("*****************");
          Set<Integer> s2=new LinkedHashSet();
          s2.add(24);
          s2.add(78);
          s2.add(15);
          s2.add(4);
          Iterator it2=s2.iterator();
          while(it2.hasNext())
          {
        	  Integer s=(Integer)it2.next();
        	  System.out.println(s);
          }
          
          System.out.println("*****************");
          Set<Integer> s3=new TreeSet();
          s3.add(16);
          s3.add(20);
          s3.add(10);
          s3.add(2);
          Iterator it3=s3.iterator();
          while(it3.hasNext())
          {
        	  Integer s=(Integer)it3.next();
        	  System.out.println(s);
          }
	}

}
