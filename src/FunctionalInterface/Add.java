package FunctionalInterface;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Add {	
	Map<Integer, String> m1=new HashMap();
	void addPolicies(int id, String name)
	{
		m1.put(id, name);
	}
	Map<Integer,String> getPolicies()
	{
		return m1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Add a1=new Add();
      Scanner sc=new Scanner(System.in);
      for(int i=1; i<=3; i++)
      {
    	  System.out.println("Enter your id");
    	  int id=sc.nextInt();
    	  System.out.println("Enter your name");
    	  String name=sc.next();
    	  a1.addPolicies(id, name);
      }
      Map<Integer,String> mp=a1.getPolicies();
      Set<Integer> keys=mp.keySet();
//    System.out.println(keys);
      Iterator it=keys.iterator();
      while(it.hasNext())
      {
    	  int key=(int)it.next();
    	  String value=mp.get(key);
    	  System.out.println(key+"  "+value);
      }     
   }
}
