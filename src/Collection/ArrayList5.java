package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          ArrayList a1=new ArrayList();
          a1.add("100");
          a1.add("200");
          a1.add("20.5");
          System.out.println(a1);
          Iterator i1=a1.iterator();
          while(i1.hasNext())
          {
        	  String str=(String)i1.next();
        	  System.out.println(str);
          }
          ArrayList a2=new ArrayList();
          a2.add("str");
          a2.add('A');
          a2.add(30);
          a2.add(null);
          System.out.println(a2);
//          a2.retainAll(a1);
          Iterator i2=a2.iterator();
          while(i2.hasNext())
          {
        	  System.out.println(i2.next());
          }
          
	}
}



