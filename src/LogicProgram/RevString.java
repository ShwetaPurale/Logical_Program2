package LogicProgram;

import java.util.Scanner;

public class RevString {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.next();
		String newStr="";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			newStr=newStr+str.charAt(i);
		}
		System.out.println("reverse string is "+newStr);
		
		if(str.equals(newStr))
		{
			System.out.println("string is palindrom");
		}
		else
		{
			System.out.println("string is not palindrom");
		}
		
	}

}
