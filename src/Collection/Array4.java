package Collection;

import java.util.ArrayList;

public class Array4 {

	public static void main(String[] args) {
//		Emp e1=new Emp(100,"Ronit");
//		Emp e2=new Emp(200,"Satish");
		ArrayList a1=new ArrayList();
		a1.add(100);
		a1.add(200);
		a1.add(300);
		a1.add(200.5f);
//		Emp e3=new Emp(300,"Rahul");
//		Emp e4=new Emp(400,"Sanjiv");
		ArrayList a2=new ArrayList();
		a2.add('x');
		a2.addAll(a1);
		a2.add("str");
		System.out.println(a2);
		System.out.println(a1.size());
		System.out.println(a2.size());
		System.out.println(a1.contains(100));
		System.out.println(a2.contains(200));
		Integer i=200;
		a2.remove(i);
		a2.remove(2);
		a2.retainAll(a1);
		System.out.println(a2);
	}
}
