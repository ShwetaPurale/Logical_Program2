package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ArrayList a1=new ArrayList();
         a1.add(100);
         a1.add(400);
         a1.add(300);
         a1.add(200);
         a1.add(00);
//         a1.add(null);
         System.out.println(a1);
         Collections.sort(a1);
         System.out.println(a1);
	}

}
