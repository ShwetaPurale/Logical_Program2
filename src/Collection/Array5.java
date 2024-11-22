package Collection;

import java.util.ArrayList;

public class Array5 {

	public static void main(String[] args) {
		Emp e1=new Emp(100,"Rahul");
		Emp e2=new Emp(200,"Satish");
		Emp e3=new Emp(300,"Snehal");
		ArrayList a1=new ArrayList();
		a1.add(e1);
		a1.add(e2);
		a1.add(e3);
		a1.add(2, e1);
		for(Object oo:a1)
		{
			Emp e=(Emp)oo;
			System.out.println(e.empId+" "+e.empName);
		}
	}

}
