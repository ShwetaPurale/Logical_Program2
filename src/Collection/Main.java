package Collection;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Employee1 implements Comparable<Employee1>
{   
   private int id;
   private String name;
   private String dept;
   private Date dateOfJoining;
   private int age;
   private double sal;
   
   
//    public Employee1(int id, String name, String dept, Date dateOfJoining, int age, int sal) {
//	super();
//	this.id = id;
//	this.name = name;
//	this.dept = dept;
//	this.dateOfJoining = dateOfJoining;
//	this.age = age;
//	this.sal = sal;
//  }
    public int getEmpId() {
		return id;
	}	
	public String getEmpName() {
		return name;
	}	
	public String getEmpDept() {
		return dept;
	}	
	public Date getEmpDateOfJoining() {
		return dateOfJoining;
	}	
	public int getEmpAge() {
		return age;
	}	
	public double getEmpSal() {
		return sal;
	}	
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String toString() {
		return "Empolyee [id=" + id + ", name=" + name + ", dept=" + dept + ", dateOfJoining=" + 
	dateOfJoining + ", age=" + age + ", sal=" + sal + "]";
	}
//	@Override
//	public int compareTo(Employee1 e) {
//		// TODO Auto-generated method stub
//		if(e.getEmpSal()> e.getEmpSal())
//		{
//			return 1;
//		}
//		return -1;
//	}		
	@Override
	public int compareTo(Employee1 e) {
		if(this.getEmpSal()> e.getEmpSal())
		{
				return 1;
			}
			return -1;
	}
}

class AgeComparator implements Comparator<Employee1>{

	public int compare(Employee1 e1, Employee1 e2) {
		// TODO Auto-generated method stub
		if(e1.getEmpAge()>e2.getEmpAge())
		{
//			if(e1.getEmpDateOfJoining()>e2.getEmpDateOfJoining()) {
			return 1;
			}
//		}
		return -1;
	}	
}

class SalComparable implements Comparator<Employee1>{

	public int compare(Employee1 e1, Employee1 e2) {
		// TODO Auto-generated method stub
		if(e1.getEmpSal()>e2.getEmpSal()) {
			return 1;
		}
		return -1;
	}	
}
class EmployeeBO
{
	static void printEmployee(List<Employee1> list)
	{
		for(Employee1 list1:list)
		{
			System.out.println(list1);
		}
	}
}

public class Main {

	static List<Employee1> list=new ArrayList();
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
        for(int i=0; i<=3; i++)
        {
        	System.out.println("Enter emp id ");
        	int id=sc.nextInt();
        	System.out.println("Enter emp name ");
        	String name=sc.next();
        	System.out.println("Enter emp dept ");
        	String dept=sc.next();
        	System.out.println("Enter emp ijoining date ");
        	String dateInString=sc.next();
        	System.out.println("Enter emp age ");
        	int age=sc.nextInt();
        	System.out.println("Enter emp salary ");
        	double sal=sc.nextDouble();
//        	list.add(new Employee(id,name,dept,date,age,sal));
        	
        	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        	 Date d1=sdf.parse(dateInString);
        	
        	 Employee1 e=new Employee1();
        	
        	e.setId(id);
        	e.setName(name);
        	e.setDept(dept);
        	e.setDateOfJoining(d1);
        	e.setAge(age);
        	e.setSal(sal);
        	list.add(e);
        }  
        List<Employee1> e1=sortBySal();
    	for(Employee1 sal:e1)
    	 {
    		 System.out.println(sal);
    	 }
   }
	 public static List<Employee1> sortBySal()
     {
		 Comparator cmp=new SalComparable();
		 Collections.sort(list,cmp);
     	return list;
     }
	 
}
