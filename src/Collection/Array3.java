package Collection;

import java.util.ArrayList;

public class Array3 {

	public static void main(String[] args) {
		Emp e1=new Emp(100,"Manish");
		Emp e2=new Emp(200,"Satish");
		Emp e3=new Emp(300,"Rahul");
		Emp e4=new Emp(400,"Ronit");
		ArrayList<Emp> a1=new ArrayList<Emp>();
		a1.add(e1);
		a1.add(e2);
		ArrayList<Emp> a3=new ArrayList<Emp>();
		a3.addAll(a1);
		a3.add(e3);
		a3.add(e4);
		
		for(Emp a2:a3)
		{
		System.out.println(a2.empId+" "+a2.empName);
		}
	}
}
