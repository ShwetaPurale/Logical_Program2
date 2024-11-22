package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

class Student
{
	 private int rollNo;
     private String name;
     private String course;
     private long phone;
     private String address;
     private Map<String, Integer> markSheet;
          
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNo, String name, String course, long phone, String address,
			Map<String, Integer> markSheet) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.course = course;
		this.phone = phone;
		this.address = address;
		this.markSheet = markSheet;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Map<String, Integer> getMarks() {
		return markSheet;
	}
	public void setMarks(Map<String, Integer> markSheet) {
		this.markSheet = markSheet;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", course=" + course + ", phone=" + phone + ", address="
				+ address + ", markSheet=" + markSheet + "]";
	}
	
//	public boolean equalsIgnoreCase(String string) {
//		// TODO Auto-generated method stub
//		return false;
//	}	     
     
}

class StudentBO
{
   Map<Integer, Student> students;
   public void addAllStudent(Map<Integer, Student> map1)
   {
        students=map1;	   
   }
   public Map<Integer, Student> getAllStudent()
   {
	   return students;
   }
   public Map<String, Integer> getMarkSheet(int studentRollNo)
   {
	  Set<Integer> setOfKey= students.keySet();
	  for(Integer rno:setOfKey)
	  {
		  if(rno==studentRollNo)
		  {
			  Student studObj=students.get(rno);
			  Map<String, Integer> markSheet=studObj.getMarks();
			  return markSheet;
		  }
	  }
	   return null;
   }
//   public Map<Integer, Student> sortStudBasedRollNo()
//   {  Set<Integer> rollNo= get(students);   
//	   return null;
//   }
   public List<Student> SortBCAStud()
   {
	   List<Student> list=new ArrayList();
//	   list.addAll(students);
	   Iterator<Student> itr=list.iterator();
	  while(itr.hasNext())
	  {
		 Student course=itr.next();
		 if(course.equals("BCA"))
		 {
			 return list;
		 }
	  }	   	   
	   return null;
   }
}


public class StudentDatail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Map<Integer, Student> map=new HashMap();
       Map<String, Integer> markSheet=null;
       Scanner sc=new Scanner(System.in);
       System.out.println("How many student do you want to add");
       int nos=sc.nextInt();
       for(int i=0; i<=nos; i++)
       {
    	   System.out.println("Enter roll no");
    	   int roll=sc.nextInt();
    	   System.out.println("Enter name");
    	   String name=sc.next();
    	   System.out.println("Enter course name");
    	   String course=sc.next();
    	   System.out.println("Enter address");
    	   String address=sc.next();
    	   System.out.println("Enter student phone no");
    	   long phone=sc.nextLong();
//    	   System.out.println("Enter student marks");
    	   markSheet=new LinkedHashMap();
    	   for(int j=0; j<=nos; j++)
    	   {
    		   System.out.println("Enter Subject");
    		   String subject=sc.next();
    		   System.out.println("Enter Marks");
    		   int marks=sc.nextInt();
    		   markSheet.put(subject, marks);
    	   }
    	   
    	   Student stud=new Student(roll, name, course, phone,address, markSheet);
    	   map.put(roll, stud);
       }
       StudentBO sbo=new StudentBO();
       sbo.addAllStudent(map);
       
      Map<Integer, Student> viewStudent= sbo.getAllStudent();
      
           Set<Entry<Integer,Student>> entries=viewStudent.entrySet();
           for(Map.Entry<Integer, Student> sd:entries){
    	   {
    		   int rollno=sd.getKey();
    		   Student studDatails=sd.getValue();
    		   System.out.println(rollno+"-----"+studDatails);
    	   }
       }
           System.out.println("Enter student Roll No");
           int rno=sc.nextInt();
           Map<String, Integer>marks=sbo.getMarkSheet(rno);
           System.out.println(marks);
          
           List<Student> BCAStud=sbo.SortBCAStud();
           System.out.println(BCAStud);
	}

}
















