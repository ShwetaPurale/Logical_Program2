
//How to add collection to Array.
package Collection;

import java.util.ArrayList;

public class ArrayList9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ArrayList a1=new ArrayList();
         a1.add("100");
         a1.add("200");
         a1.add("300");
        a1.add(20);
         Object[] s1=a1.toArray(new Object[a1.size()]);
         for(Object s2:s1)
         {
//        	 if(s2 instanceof String)
//        	 {
//        		 String s=(String)s2;
        	     System.out.println(s2);        	     
//        	 }
         }
	}
}
