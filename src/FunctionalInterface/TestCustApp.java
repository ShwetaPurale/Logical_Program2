package FunctionalInterface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

public class TestCustApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Set<Customer> list=new HashSet();
		 CustService service=new CustService();
         Scanner sc=new Scanner(System.in);
         System.out.println("How many Customer do you want to add");
         int n=sc.nextInt();
         for(int i=0; i<n; i++)
         {
        	 System.out.println("Enter cust id");
        	 int id=sc.nextInt();
        	 System.out.println("Enter cust name");
        	 String name=sc.next();
        	 System.out.println("Enter cust phone no");
        	 long phone=sc.nextLong();
        	 System.out.println("Enter cust gender");
        	 String gender=sc.next();
        	 System.out.println("Enter cust address");
        	 String address=sc.next();
        	 Customer cust=new Customer(id, name, phone, gender, address);
        	 list.add(cust);
         }
         service.addAllCustonmer(list);
         Iterator<Customer> itr= list.iterator();
         while(itr.hasNext())
         {
        	 Customer custData=itr.next();
        	 System.out.println(custData);
         }
         
         System.out.println("**********");
         List<Customer> custList= service.getAllCust();
         System.out.println(custList);
         
         System.out.println("**********");
         List<Customer> city= service.getAllCustFromSameCity("pune");
         System.out.println(city);
         
         System.out.println("**********");
         long male= service.countMaleCust();
         System.out.println("no of male Customer "+male);
         
         System.out.println("**********");
         System.out.println("Customer sorted by id");
         Stream<Customer> id= service.sortCustById();
         Iterator<Customer> itr1= id.iterator();
         while(itr1.hasNext())
         {
        	 Customer idOfCust=itr1.next();
         System.out.println(idOfCust);
         }
	}

}








