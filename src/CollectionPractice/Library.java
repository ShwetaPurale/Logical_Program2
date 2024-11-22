package CollectionPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Member
{
   private int Id;
   private String name;
   private String address;
public Member() {
	super();
	// TODO Auto-generated constructor stub
}
public Member(int id, String name, String address) {
	super();
	Id = id;
	this.name = name;
	this.address = address;
}
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "Member [Id=" + Id + ", name=" + name + ", address=" + address + "]";
}


    
}
public class Library {
	static List<Member> list=new ArrayList();
	public void addMember(List<Member> m1)
	{
	     	list= m1;
	}

	public List<Member> viewAllMember()
	{
		return list;
	}
	
	public List<Member> viewMembersByAddress(String address)
	{
		List<Member> memberList=new ArrayList();
		Iterator<Member> itr=list.iterator();
		while(itr.hasNext())
		{
			Member address1=itr.next();
			if(address1.getAddress().equalsIgnoreCase(address))
			{
				memberList.add(address1);
			}
			
		}
		return memberList;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Library library=new Library();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many member do you want to store");
		int n=sc.nextInt();
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter memeber id");
			int id=sc.nextInt();
			System.out.println("Enter memeber name");
			String name=sc.next();
			System.out.println("Enter memeber Address");
			String address=sc.next();
			Member member=new Member(id, name, address);
			
			list.add(member);
		}
//		System.out.println(list);
		library.addMember(list);
		List<Member> allMember1=library.viewAllMember();
		for(Member allMember: allMember1)
		{
		System.out.println(allMember);
		}
		System.out.println("***********");
		List<Member> address=library.viewMembersByAddress("pune");
		for(Member memberList1: address)
		{
		System.out.println(memberList1);
		}
	}
}










