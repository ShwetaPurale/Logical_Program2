package CollectionPractice;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList al=new ArrayList();
        al.add(10);
        al.add(20.5f);
        al.add("Cyber");
        al.add('A');
        al.add(null);
        al.add(true);
        System.out.println(al);
        al.add(2, 0);
        al.remove(2);
        al.remove(Integer.valueOf(10));
        System.out.println(al);
        List list=new ArrayList();
        list.add("java");
        list.addAll(al);
        System.out.println(list);
        System.out.println(list.contains(10));
        System.out.println(list.isEmpty());
        System.out.println(list.retainAll(al));
        System.out.println(list);
	}
}









