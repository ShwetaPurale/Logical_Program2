package Collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class TravelPackage
{
    int packageId;
    String packageName;
    double packagePrice;
    String source;
    String destination;
	public void setPackageId(int packageId) {
		this.packageId = packageId;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public void setPackagePrice(double packagePrice) {
		this.packagePrice = packagePrice;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getPackageId() {
		return packageId;
	}
	public String getPackageName() {
		return packageName;
	}
	public double getPackagePrice() {
		return packagePrice;
	}
	public String getSource() {
		return source;
	}
	public String getDestination() {
		return destination;
	}
    
	public String toString()
	{
		return "TravelPackage[PackageId= "+packageId+ ",PackageName= "+packageName+ ","
				+ "packagePrice= "+packagePrice+ ",Source=" +source+ ",Destination="+destination+"]";
	}
	
 }
 public class Travel {
	static Comparator<TravelPackage> maxCmp;
	 List<TravelPackage> tp=new ArrayList<TravelPackage>();
     Stream<TravelPackage> strPck;
     void addPackage(TravelPackage tp2)
     {
    	 tp.add(tp2);
    	 strPck=tp.stream();
     }
	
	public TravelPackage getMaxPackage()
	{
		 maxCmp=(p1,p2)->{
			if(p1.getPackagePrice()>p2.getPackagePrice())
			{
				return 1;
			}
			return -1;
		};
		TravelPackage t=tp.stream().max(maxCmp).get();
		return t;
	}
	
	public  List<TravelPackage> searchPackage(String s, String d)
	{
		List<TravelPackage> newList=new ArrayList();
       for(TravelPackage t:tp) 
       {
    	   if(t.getSource().equalsIgnoreCase(s) && t.getDestination().equalsIgnoreCase(d))
    	   {
    		   newList.add(t);
    	   }    	   
       }
       return newList;
       
//		List<TravelPackage> list=tp.stream()
//				.filter(travel->travel.getSource().equalsIgnoreCase(s) && travel.getDestination().equalsIgnoreCase(d))
//				.collect(Collectors.toList());
//		return list;
	}
//	Comparator<TravelPackage> cmp=(p1,p2)->{
//		if(p1.getPackageName()>p2.getPackageName())
//		{
//			return 1;
//		}
//		return -1;
//	};
//	List<TravelPackage> l2=tp.stream().sorted(cmp).forEach(t->System.out.println(t));
	
//	tp.stream().sorted(maxCmp).forEach(t->System.out.println(t)); 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Travel t1=new Travel();
       Scanner sc=new Scanner(System.in);
       for(int i=0; i<5; i++)
       {
    	   System.out.println("Enter your Package Id: ");
    	   int id=sc.nextInt();
    	   System.out.println("Enter your Package Name: ");
    	   String name=sc.next();
    	   System.out.println("Enter your Package Price: ");
    	   double price=sc.nextDouble();
    	   System.out.println("Enter your Package Source: ");
    	   String source=sc.next();
    	   System.out.println("Enter your Destination: ");
    	   String destination=sc.next();
    	   TravelPackage tp1=new TravelPackage();
//    	   ((TravelPackage)obj).setPackageId(id);
    	   tp1.setPackageId(id);
    	   tp1.setPackageName(name);
    	   tp1.setPackagePrice(price);
    	   tp1.setSource(source);
    	   tp1.setDestination(destination);  	   
    	   t1.addPackage(tp1);    	       	   
       }       
       System.out.println(t1);
       TravelPackage tp3=t1.getMaxPackage();
       System.out.println(tp3);
      List<TravelPackage> l1= t1.searchPackage("pune", "Mumbai");
      System.out.println(l1);     
	  
	}	
}
