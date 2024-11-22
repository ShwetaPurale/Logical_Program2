package Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

class Product1
{
  private String pName;
  private double pPrice;
  private Date pMfdDate;
  Product1(String pName,double pPrice,Date pMfdDate)
  {
	  this.pName=pName;
	  this.pPrice=pPrice;
	  this.pMfdDate=pMfdDate;
  }
public String getpName() {
	return pName;
}
public double getpPrice() {
	return pPrice;
}
public Date getpMfdDate() {
	return pMfdDate;
}
@Override
public String toString() {
	return "Product [pName=" + pName + ", pPrice=" + pPrice + ", pMfdDate=" + pMfdDate + "]";
}

}

class priceComparator implements Comparator<Product1>{

	
	public int compare(Product1 p1, Product1 p2) {
		if(p1.getpPrice()>p2.getpPrice())
		{
			return 1;
		}
		return -1;
	}	
}

class nameComparator implements Comparator<Product1>
{

	public int compare(Product1 p3, Product1 p4) {
		return p3.getpName().compareTo(p4.getpName());
	}
	
}


public class ProductDatails {

	static List<Product1> lp=new ArrayList();
	static {
		lp.add(new Product1("shweta",641000,new Date()));
		lp.add(new Product1("snehal",15800,new Date()));
		lp.add(new Product1("prashant",104100,new Date()));
		lp.add(new Product1("satish",48200,new Date()));
		lp.add(new Product1("priya",64800,new Date()));
	}
	public static List<Product1> sortByPrice()
	{
	    Comparator cmp=new priceComparator();
		Collections.sort(lp,cmp);
		return lp;
	}
	public static List<Product1> sortByName()
	{
		Collections.sort(lp,new nameComparator());
		return lp;
	}
	
	public static void main(String[] args) 
	{		
       List<Product1> list1=sortByName();
       for(Product1 p:list1)
       {
    	   System.out.println(p);
       }
       System.out.println("***************");
       List<Product1> list2=sortByPrice();
       for(Product1 p:list2)
       {
    	   System.out.println(p);
       }
	}

}
