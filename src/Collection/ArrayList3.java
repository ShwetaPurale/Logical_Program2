package Collection;

import java.util.ArrayList;

public class ArrayList3 {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(new Emp(100,"Rahul"));
		a1.add(new Emp(200,"Satish"));
//		for(Object o1:a1)
//		{
//			Emp e1=(Emp)o1;
//			System.out.println(e1.empId+" "+e1.empName);
//		}
		Object o2=a1.get(0);
		Emp e2=(Emp)o2;
		System.out.println(e2.empId+" "+e2.empName);
	}
}



