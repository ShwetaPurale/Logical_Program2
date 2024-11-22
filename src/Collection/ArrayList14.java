package Collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ArrayList14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Double> l1=new ArrayList();
        l1.add(22000.00);
        l1.add(12000.00);
        l1.add(27000.00);
        l1.add(15000.00);
        l1.add(18000.00);
        l1.add(1000.00);
        System.out.println(l1);
        l1.stream().filter(sal->sal<10000).map(sal->sal+5000).sorted().forEach(sal->System.out.println(sal));
        
//        Find out the Maximum salary.
        Comparator<Double> maxCmp=(sal1, sal2)->
        {
        	if(sal1>sal2)
        	{
        		return 1;
        	}
        	return -1;
        };
        Stream<Double> strObj=l1.stream();
        Optional<Double> obj=strObj.max(maxCmp);
        double maxSal=obj.get();
        System.out.println(maxSal);
        
//      Find out Minimun value.
        
        Comparator<Double> minCmp=(sal3, sal4)->
        {
        	if(sal3 > sal4)
        	{
        		return 1;
        	}
        	return -1;
        };
        Stream<Double> sObj=l1.stream();
        Optional<Double> obj1=sObj.min(minCmp);
        double minSal=obj1.get();
        System.out.println(minSal);
	}

}
