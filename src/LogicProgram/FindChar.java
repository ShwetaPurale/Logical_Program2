package LogicProgram;

import java.util.Scanner;

public class FindChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str=sc.next();
		System.out.println("enter char");
		char ch=sc.next().charAt(0);
		int count=0;
		
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)==ch)
			{
				count++;
			}
		}
		System.out.println(count);
		

	}

}
