package map;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Raider {

	static Set<Raider> s=new TreeSet();
	private String name;
	
	public Raider(String name) {
		super();
		this.name = name;
	}
	public Raider() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of Raider");
        int n=sc.nextInt();
        for(int i=0; i<=n; i++)
        {
        	System.out.println("Enter Raider name");
        	String name=sc.next();
        	Raider r=new Raider(name);
        	s.add(r);
        }
	}	
}


