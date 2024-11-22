package Core.java;

import java.util.Scanner;

public class NonRepeatedStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.next();
		
		for(int i=0; i<str.length(); i++)
		{
			int count=0;
			for(int j=0; j<str.length(); j++)
			{
				if(i!=j && str.charAt(i)== str.charAt(j))
				{
					count++;
//					break;
				}
			}
			if(count==0)
			{
				System.out.println(str.charAt(i)+"");
//				break;
			}
		}

	}

}
