package Collection;
//import java.lang.Array;
import java.util.ArrayList;

public class Array2 {

	public static void main(String[] args) {
		Emp e=new Emp(100, "Snehal");
		Stud s=new Stud(200,"Satish");
		Integer i=100;
		ArrayList a=new ArrayList();
		a.add(e);
		a.add(s);
		a.add(i);
		for(Object o:a) {
			if(o instanceof Emp)
			{
				Emp e1=(Emp)o;
				System.out.println(e1.empId+" "+e1.empName);
			}
			if(o instanceof Stud)
			{
				Stud s1=(Stud)o;
				System.out.println(s1.studId+" "+s1.studName);
			}
			if(o instanceof Integer)
			{
				Integer i1=(Integer)o;
				System.out.println(i1);
			}			
		}
		
	}

}
