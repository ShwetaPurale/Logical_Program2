package CollectionPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class EmployeeDetails {

	private int id;
	private String designation;
	private int salary;
	
	public EmployeeDetails(int id, String designation, int salary) {
		super();
		this.id = id;
		this.designation = designation;
		this.salary = salary;
	}
	public EmployeeDetails() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [id=" + id + ", designation=" + designation + ", salary=" + salary + "]";
	}
	
	public HashMap<Integer, Integer> IncreaseSal(HashMap<Integer, String> mp1, HashMap<Integer, Integer> mp2)
	{
		HashMap<Integer, Integer> newMap=new HashMap();
	    Set<Integer> key=mp1.keySet();
	    Iterator<Integer> itr=key.iterator();
	    while(itr.hasNext())
	    {
	    	int id=itr.next();
	    	String desg=mp1.get(id);
	    	
	    	if(desg.equalsIgnoreCase("Manager"))
	    	{
	    		int sal=mp2.get(id);
	    		int salary=sal+5000;
	    		newMap.put(id, salary);
	    	}	    	
	    }
		return newMap;
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map1=new HashMap();
		HashMap<Integer, Integer> map2=new HashMap();
		EmployeeDetails empDetails=new EmployeeDetails();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of Employee");
		int n=sc.nextInt();
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter employee id");
			int id=sc.nextInt();
			System.out.println("Enter employee designation");
			String designation=sc.next();
			System.out.println("Enter employee Salary");
			int salary=sc.nextInt();
			EmployeeDetails employee=new EmployeeDetails(id, designation, salary);
			map1.put(id, designation);
			map2.put(id, salary);
		}
		
	   HashMap<Integer, Integer> empDet=empDetails.IncreaseSal(map1, map2);
	   Set<Entry<Integer, Integer>> entries= empDet.entrySet();
	   for( Map.Entry<Integer, Integer> entries1 : entries)
	   {
//		   int id=entries1.getKey();
//		   int sal= entries1.getValue();
		   System.out.println(entries1.getKey()+" "+entries1.getValue());
	   }
		
	}

}
