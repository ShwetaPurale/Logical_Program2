package map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class RaiderDetails implements Comparable<RaiderDetails>
{
	
	private String name;
	private long score;
	
	public RaiderDetails(String name, long score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getscore() {
		return score;
	}
	public void setscore(long score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "RaiderDetails [name=" + name + ", score=" + score + "]";
	}

	@Override
	public int compareTo(RaiderDetails o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
class ScoreComparator implements Comparator<RaiderDetails>{

	@Override
	public int compare(RaiderDetails r1, RaiderDetails r2) {
		// TODO Auto-generated method stub
		if(r1.getscore()<r2.getscore())
		{
			return 1;
		}
		return 0;
	}
	
	
}
	
public class Main1  {
	static List<RaiderDetails> list=new ArrayList();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
      Scanner sc=new Scanner(System.in);
      System.out.println("How many Raider do you want to store");
      int nor=sc.nextInt();
      for(int i=0; i<nor; i++)
      {
    	  System.out.println("Enter Raider name");
    	  String name=sc.next();
    	  System.out.println("Enter score of Raider");
    	  long score=sc.nextLong();
    	   
    	  RaiderDetails rd=new RaiderDetails(name, score);
//    	  rd.setName(name);
//    	  rd.setscore(score);
//    	  RaiderDetails rd1=new RaiderDetails(name, score);
    	  list.add(rd);
      }    
      List<RaiderDetails> rd=sortByScore();
      for(RaiderDetails rd1:rd)
      {
    	  System.out.println(rd1);
      }
      
	}
	public static List<RaiderDetails> sortByScore() 
	{
		Comparator cmp=new ScoreComparator();
	      Collections.sort(list,cmp);
	      return list;
	}

}


