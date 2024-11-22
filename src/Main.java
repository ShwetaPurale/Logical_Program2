import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Revenue{
	private String revenueCategary;
	private int revenueAmount;
	public Revenue(String revenueCategary, int revenueAmount) {
		super();
		this.revenueCategary = revenueCategary;
		this.revenueAmount = revenueAmount;
	}
	public String getRevenueCategary() {
		return revenueCategary;
	}
	public void setRevenueCategary(String revenueCategary) {
		this.revenueCategary = revenueCategary;
	}
	public int getRevenueAmount() {
		return revenueAmount;
	}
	public void setRevenueAmount(int revenueAmount) {
		this.revenueAmount = revenueAmount;
	}
	@Override
	public String toString() {
		return "Revenue [revenueCategary=" + revenueCategary + ", "
				+ "revenueAmount=" + revenueAmount + "]";
	}
	
}
public class Main {

	static Set<Revenue> s=new TreeSet();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter no of operation");
      int n=sc.nextInt();
      for(int i=0; i<=n; i++)
      {
    	  System.out.println("Enter revenue categary");
    	  String categary=sc.next();
    	  System.out.println("Enter revenue amount");
    	  int amount=sc.nextInt();
    	  Revenue rs=new Revenue(categary, amount);
    	  rs.setRevenueCategary(categary);
    	  rs.setRevenueAmount(amount);
    	  s.add(rs);
      }
      Iterator<Revenue> itr=s.iterator();
      while(itr.hasNext())
      {
    	  Revenue categary=itr.next();
    	  Revenue amount=itr.next();
    	  System.out.println(categary.getRevenueCategary()+"  "+amount.getRevenueAmount());
      }
	}

}
