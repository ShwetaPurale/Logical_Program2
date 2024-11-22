
// How to Add Array into collection.
package Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String[] str= {"Cyber", "Success", "Training", "Institude"};
//         for(int i=0;i<str.length;i++) {
//         System.out.println(str[i]);
//         }
         ArrayList a1=new ArrayList(Arrays.asList(str));
         a1.add(100);
         a1.add(200);
         System.out.println(a1);
	}
}
