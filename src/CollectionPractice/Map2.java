package CollectionPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Condidate
{
    private int id;
    private String name;
    Set<String> Skill;
    private int yearOfExpr;
    private int age;
    private String gender;
	public Condidate(int id, String name, Set<String> skill, int yearOfExpr, int age, String gender) {
		super();
		this.id = id;
		this.name = name;
		Skill = skill;
		this.yearOfExpr = yearOfExpr;
		this.age = age;
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<String> getSkill() {
		return Skill;
	}
	public void setSkill(Set<String> skill) {
		Skill = skill;
	}
	public int getYearOfExpr() {
		return yearOfExpr;
	}
	public void setYearOfExpr(int yearOfExpr) {
		this.yearOfExpr = yearOfExpr;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Condidate [id=" + id + ", name=" + name + ", Skill=" + Skill + ", yearOfExpr=" + yearOfExpr + ", age="
				+ age + ", gender=" + gender + "]";
	}    
}

class CondidateService
{
   Map<Integer, Condidate> condidates;
   
   public void addCondidate(Map<Integer, Condidate> condidate)
   {
	   condidates=condidate;
   }
   public Map<Integer, Condidate> viewCondidate()
   {
	   return condidates;
   }
   public Map<Integer, Condidate> viewCondidateBySkill(String skill)
   {   
        String[] skills=  skill.split(",");
	   Map<Integer,Condidate> skillSet=new HashMap();
	   Set<Integer> sk=condidates.keySet();
	   Iterator<Integer> itr=sk.iterator();
	   while(itr.hasNext())
	   {
		     int id=itr.next();
		      Condidate can=condidates.get(id);
		         Set<String> skillSets=can.getSkill();
		   
		         for(String sk1:skillSets)
		         {		        	 
		        	 for(int i=0; i<skills.length; i++)
		        	 {
		        		 if(skills[i].equals(sk1))
		        		 {
		        			 skillSet.put(id, can);
		        		 }
		        	 }  
		         }
	   }   
	   return skillSet;
   }
   
   public Map<Integer, Condidate> getCondidateBasedOnExpr()
   {
	   return null;
   }
   public String countMaleCondidate()
   {
	   
	   return null;
   }
   
   public Condidate getYoungestCondidate()
   {
	 Set<Condidate> ageSet=new HashSet();
	 Map<Integer, Condidate> ageList=new HashMap();
	 Set<Integer> age= ageList.keySet();
	 Iterator<Integer> itr=age.iterator();
	 while(itr.hasNext())
	 {
		 int condi=itr.next();
		Condidate age1= ageList.get(age);
		ageSet.add(age1);
	 }
	   return (Condidate) ageSet;
   }
}

  public class Map2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Condidate> map=new HashMap();
       CondidateService condiSer=new CondidateService();
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter no of Condidate");
       int n=sc.nextInt();
       for(int i=0; i<n; i++)
       {
    	   System.out.println("Enter condidate id");
    	   int id=sc.nextInt();
    	   System.out.println("Enter condidate name");
    	   String name=sc.next();
    	   System.out.println("Enter condidate skill----1");
    	   String skill1=sc.next();
    	   System.out.println("Enter condidate skill----2");
    	   String skill2=sc.next();
    	   System.out.println("Enter condidate skill----3");
    	   String skill3=sc.next();
    	   System.out.println("Enter condidate experience");
    	   int experience=sc.nextInt();
    	   System.out.println("Enter condidate age");
    	   int age=sc.nextInt();
    	   System.out.println("Enter condidate gender");
    	   String gender=sc.next();
    	   Set<String> skill=new HashSet();
    	   skill.add(skill1);
    	   skill.add(skill2);
    	   skill.add(skill3);
    	   Condidate condidate=new Condidate(id, name, skill, experience, age, gender);
    	   map.put(id, condidate);
       }
       
       condiSer.addCondidate(map);
       Map<Integer, Condidate> condidateDetails=condiSer.viewCondidate();       
//       System.out.println(condidateDetails);
       
      Set<Integer> id= condidateDetails.keySet();
      Iterator<Integer> itr=id.iterator();
      while(itr.hasNext())
      {
    	  int id1=itr.next();
    	  Condidate value1=condidateDetails.get(id1);
    	  System.out.println(id1+"  "+value1);
      }
      
      Condidate age=condiSer.getYoungestCondidate();
      System.out.println(age);
       
	}
}
  
  
  
  
  
  
  
  
  
  
  
  
  
