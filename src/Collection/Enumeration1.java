package Collection;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration1 {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(100);
		v.add(200);
		v.add(300);
		//v.remove(0);
		System.out.println(v);
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}
}




