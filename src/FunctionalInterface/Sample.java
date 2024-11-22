package FunctionalInterface;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Sample {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample sample=new Sample();
       List<Double> listOfSal=new ArrayList();
       listOfSal.add(23000.00);
       listOfSal.add(53000.00);
       listOfSal.add(8000.00);
       listOfSal.add(14000.00);
       listOfSal.add(12000.00);
       listOfSal.add(60000.00);
       listOfSal.add(10000.00);
       listOfSal.add(14000.00);
       Stream<Double> salaries=listOfSal.stream();
       Iterator<Double> itr= salaries.iterator();
       while(itr.hasNext())
       {
    	 Double sal= itr.next();
    	 System.out.println(sal);
       }
       
       System.out.println();
       System.out.println("Add Salary");
       Function<Double,Double> sal=(input)->{
    	  return input+5550;
       };
       listOfSal.stream().filter(m->m<20000.00).map(sal).forEach(salary->System.out.println(salary));
       
       System.out.println();
       System.out.println("Reduct salary 10%");
       Function<Double, Double> fun=(input)->{
    	   return input*0.90;
       };
       listOfSal.stream().filter(m->m>=50000.00).map(fun).forEach(m->System.out.println(m));
       
       System.out.println();
       System.out.println("Sorted salary in Descending order");
       Comparator<Double> allSal=(sal1, sal2)->{
    	   if(sal1<sal2)
    	   {
    		   return 1;
    	   }
    	   return -1;
       };
       listOfSal.stream().sorted(allSal).forEach(m->System.out.println(m));
       
       System.out.println();
       System.out.println("Maximum Salary");
       Comparator<Double> allSal1=(sal1, sal2)->{
    	   if(sal1>sal2)
    	   {
    		   return 1;
    	   }
    	   return -1;
       };
       Double maxSal=listOfSal.stream().max(allSal1).get();
       System.out.println(maxSal);
       
       System.out.println();
       System.out.println("minimum Salary");
       Double minSal=listOfSal.stream().min(allSal1).get();
       System.out.println(minSal);
       
       System.out.println();
       System.out.println("Calculate all Salary");
       System.out.println(listOfSal.stream().reduce (0.0,(sum, sal2)->sal2+sum));
	}

}
