package FunctionalInterface;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FunInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> marks=new ArrayList();
        marks.add(35);
        marks.add(84);
        marks.add(93);
        marks.add(30);
        marks.add(45);
        marks.add(32);
        Stream<Integer> streamOfMarks= marks.stream();
        streamOfMarks.forEach(m->System.out.println(m));
        
        System.out.println("All passing marks");
        Predicate<Integer> predicate=(input)->{
        	if(input>=35)
        	{
        		return true;
        	}
        	return false;
        };
        
        Consumer<Integer> consumer=(m)->{System.out.println(m);};
        marks.stream().filter(predicate).forEach(consumer);
        
        
        System.out.println("**************");
//        OR code
        marks.stream().filter(m->m>=35).forEach(m->System.out.println(m));
        
        System.out.println("*******************");
        System.out.println("All fail marks");
        marks.stream().filter(m->m<35).forEach(m->System.out.println(m));
        
        System.out.println("printl only frist three object");
        marks.stream().limit(3).forEach(m->System.out.println(m));
        
        System.out.println("skipping 4 object from list");
        marks.stream().skip(4).forEach(m->System.out.println(m));
        
        
        int passedCount=(int)marks.stream().filter(m->m>=35).count();
        System.out.println(passedCount);
        
        System.out.println("Adding Grace marks");
        Function<Integer, Integer> fun=(input)->{
        	return input+5;
        };
        marks.stream().filter(m->m>=30 && m<35).map(fun).forEach(m->System.out.println(m));
        
        
        marks.stream().sorted().forEach(m->System.out.println(m));
        
        System.out.println("Sorted in Descending order");
        Comparator<Integer> cmp=(obj1, obj2)->{
        	if(obj1<obj2)
        	{
        		return 1;
        	}
        	return -1;
        };
        marks.stream().sorted(cmp).forEach(m->System.out.println(m));
        
        System.out.println("max marks");
        Comparator<Integer> cmp1=(obj1, obj2)->{
        	if(obj1>obj2)
        	{
        		return 1;
        	}
        	return -1;
        };
       int max= marks.stream().max(cmp1).get();
       System.out.println(max);
	}
}




