package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Emp2> a1=new ArrayList<Emp2>();
        a1.add(new Emp2(100,"Rahul"));
        a1.add(new Emp2(600,"Satish"));
        a1.add(new Emp2(300,"Soham"));
        a1.add(new Emp2(500,"Manish"));
        a1.add(new Emp2(200,"Rajesh"));
        for(Emp2 e2:a1) 
        {
        System.out.println(e2.empId+" "+e2.empName);
        }
        System.out.println("------------");
        Collections.sort(a1);
        for(Emp2 e2:a1)
        {
            System.out.println(e2.empId+" "+e2.empName);
        }
	}

}
