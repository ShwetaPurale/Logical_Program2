package CollectionPractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List li=new LinkedList();
       li.add(52);
       li.add(5.5f);
       li.add("Cyber");
       li.add(648);
       li.add("Success");
       li.add('M');
       System.out.println(li);
       li.remove(2);
       li.add(2, "java");
       System.out.println(li);
       List list=new ArrayList();
       list.add(85);
       list.addAll(li);
       System.out.println(list);
       System.out.println(list.retainAll(li));
       System.out.println(list);
	}
}



