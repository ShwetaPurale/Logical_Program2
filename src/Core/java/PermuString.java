package Core.java;

import java.util.Scanner;

public class PermuString {
	
	static void parmuString1(String str)
	{
		if(str.length()==0)
		{
			System.out.println("permutation");
			
		}
		for(int i=0; i<str.length(); i++)
		{
			for(int j=0; j<str.length(); j++)
			{
				char ch=str.charAt(i);
				String str1=str.substring(0,i)
						+str.substring(i+1);
			}
		}
		System.out.println(str);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.next();
		
		parmuString1(str);
		
		

	}

}
