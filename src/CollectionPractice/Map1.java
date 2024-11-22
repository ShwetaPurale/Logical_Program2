package CollectionPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Map map=new HashMap();
         map.put(100, 600);
         map.put(51, "cyber");
         map.put(20.5f, 'a');
         map.put("abc", 50);
         System.out.println(map);
         Set key=map.keySet();
        Object value= map.get(key);
//         Iterator itr=key.iterator();
//         while(itr.hasNext())
//         {
//        	 System.out.println(itr.next());
        	 System.out.println(value+" "+key);
//         }
	}
}
