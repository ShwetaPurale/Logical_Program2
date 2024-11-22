package FunctionalInterface;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Function1 {

	public static void main(String[] args) {
		
//		1] Function Interface is a functional Interface.
        Function<Integer,String> p=(param)->
        {
        	return "square of no is: "+(param*10);
        };
        String str=p.apply(5);
        System.out.println(str);
        
//      2] Predicate Interface is a functional Interface.
        String str1="shweta@gmail.com";
        Predicate<String> pr=(p1)->{
        	
        	if(p1.contains("p"))
        	{
        		return true;
        	}
        	return false;
        };
        boolean b=pr.test(str1);
        System.out.println(b);
        
//       3] Consumer Interface is a functional Interface.
        Consumer<String> cmp=(p2)->{
        	System.out.println(p2.substring(1,5).toUpperCase());
        };
        cmp.accept("Google");
        
//     4] Supplier Interface is a functional Interface.
        Supplier<Integer> sp=()->{
        	return 10;
        };
        System.out.println(sp.get());
        
//      5] Comparator Interface is a functional Interface.
        Comparator<Integer> cmd=(c1,c2)->{
        	if(c1>c2)
        	{
        		return 1;
        	}
        	return -1;
        };
        System.out.println(cmd.compare(10, 25));
	}

}
