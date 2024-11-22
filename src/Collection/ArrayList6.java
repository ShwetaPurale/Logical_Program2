
// In ArrayList i use ListIterator cursor & use add() and remove() method
package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList6 {

	public static void main(String[] args)
	{
		ArrayList<Emp> a1=new ArrayList<Emp>();
		a1.add(new Emp(100,"Rahul"));
		a1.add(new Emp(200,"Satish"));
		a1.add(new Emp(300,"Saan"));
		ListIterator<Emp> i1=a1.listIterator();
		while(i1.hasNext())
		{
		    		    
			Emp e=i1.next();
			if(e.empName.equals("Satish"))
			{
				i1.remove();
			    i1.add(new Emp(500,"Rajesh"));
			}
		    
		}
		i1=a1.listIterator();
		while(i1.hasNext())
		{
			Emp e=i1.next();
		    System.out.println(e.empId+" "+e.empName);
		}
		
	}
}
