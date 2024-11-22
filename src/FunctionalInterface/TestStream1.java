package FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestStream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         List<String> l1=new ArrayList();
         l1.add("mrs.abc");
         l1.add("mr.kyc");
         l1.add("mr.satish");
         l1.add("mrs.komal");
         l1.add("ms.sneha");
         Predicate<String> p=(p1)->{
        	 if(p1.startsWith("mrs"))
        	 {
        		 return true;
        	 }
        	 return false;
         };
         long male=l1.stream().filter(p).count();
         System.out.println(male);
         
         System.out.println("------------------");
         l1.stream().filter(p1->p1.startsWith("mrs")).forEach(name->System.out.println(name));
        
         
         System.out.println("----------------");
         l1.stream().collect(Collectors.toSet()).forEach(n->System.out.println(n));
         
         System.out.println("----------------");
         l1.stream().map(name->name.concat(" ").concat("Thank you for your vote")).forEach(n->System.out.println(n));
    }

}
