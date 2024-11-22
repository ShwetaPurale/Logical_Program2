package FunctionalInterface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Integer> marks=new ArrayList();
        marks.add(100);
        marks.add(30);
        marks.add(20);
        marks.add(800);
        marks.add(600);
        
//        1. Approach.
//        for(Integer l1:marks)
//        {
//        	System.out.println(l1);
//        }
//        System.out.println("---------------");
        
//       2. Approach.
//        Iterator i1=marks.iterator();
//        while(i1.hasNext())
//        {
//        	System.out.println(i1.next());
//        }
//        System.out.println("---------------");
        
//       3. Approach.
//        Consumer<Integer> cmp=m->System.out.println(m);
//        marks.forEach(cmp);
        
//       4. Approach.
//        Set<Integer> s=new HashSet(marks);
//        Iterator i=s.iterator();
//        while(i.hasNext())
//        {
//        	System.out.println(i.next());
//        }
        
//        5. Approach.
//        Set<Integer> s=new HashSet();
//        for(int i=0;i<marks.size(); i++)
//        {
//        	if(marks.get(i)>=35)
//        	{
//        		s.add(marks.get(i));
////        		System.out.println("Student is pass "+marks);
//        	}
//        }
//        s.forEach(m->System.out.println(m));
        
        
//        5. Approach.
        
        Predicate<Integer> p=m->m>=35;
        marks.stream().filter(p).collect(Collectors.toSet())
        .forEach(m->System.out.println(m));
	}

}
