package Collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

class Product
{
	int proId;
	String proName;
	double proPrice;
	Date proMfd;
	Product(int proId, String proName, double proPrice, Date proMfd)
	{
		this.proId=proId;
		this.proName=proName;
		this.proPrice=proPrice;
		this.proMfd=proMfd;
	}
	public String toString()
	{
		return "Product [productId=" +proId+ ", ProductName="+proName+ ", ProductPrice="+proPrice+ ", ProductMfd="+proMfd+ "]";
	}
	public int getAllValue() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
public class ProductService {
	 List<Product> lp=new ArrayList();
     Stream<Product> strPro;
     void addProduct(Product p)
     {
     lp.add(p);
     strPro=lp.stream();
     }
     Stream<Product> getAllValue()
     {
    	 return strPro;
     }
     void getProductWithHighestPrice()
     {
    	 Comparator<Product> cmp=(p1,p2)->{
    		 if(p1.getAllValue()>p2.getAllValue()) {
    			 return 1;
    		 }
    		 return -1;
    		 };
    }
     

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        ProductService ps=new ProductService();
        for(int i=0;i<3;i++)
        {
        	System.out.println("Enter Product Id: ");
        	int id=sc.nextInt();
        	System.out.println("Enter Product Name: ");
        	String name=sc.next();
        	System.out.println("Enter Product Price: ");
        	double price=sc.nextDouble();
        	Product p=new Product(id, name, price,new Date());
        	ps.addProduct(p);
        }
        ps.getAllValue().forEach(p1->System.out.println(p1));
	}

}
