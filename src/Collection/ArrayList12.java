package Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList a1=new ArrayList();
        a1.add(100);
        a1.add(200);
        a1.add(300);
        a1.add(400);
        System.out.println(a1);
        Integer[] o=(Integer[])a1.toArray(new Integer[a1.size()]);
        for(Integer o1:o)
        {
        System.out.println(o1);
        }
		
		String[] str=new String[3];
		str[0]="Cyber";
		str[1]="Success";
		str[2]="Training";
		ArrayList a2=new ArrayList(Arrays.asList(str));
		System.out.println(a2);
	}

}
