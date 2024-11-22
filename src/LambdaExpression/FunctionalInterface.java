package LambdaExpression;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Predicate<String> predicate=(input)->{
        	 return input.length()>=5 && input.length()<=20;
         };
        boolean name= predicate.test("cyber");
        if(name)
        {
        System.out.println("valid name");
        }
        else
        {
         System.out.println("Invalid name");
        }
        
        
        
        Function<Integer, String> function=(input)->{
        	if(input%2==0)
        	{
        		return"no is even";
        	}
    		return"no is old";
        };
        function.apply(20);
        
        
        Consumer<Double> con=(salary)->{
        	System.out.println(salary*15);
        };
        con.accept(5000.00);
        
        
        Supplier<String> sup=()->{
        	return "Welcome";
        };
        String welMsg=sup.get();
        System.out.println(welMsg);
        
        
        Comparator<Integer> cmp=(obj1, obj2)->{
        	if(obj1>obj2)
        	{
        		return 1;
        	}
        	return -1;
        };
       int result= cmp.compare(45, 20);
        System.out.println(result);
	}
}
