package Program;

import java.util.Scanner;

public class RevString {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.next();
		String newStr="";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			char ch=str.charAt(i);
			newStr = newStr+ch;
		}
		System.out.println("Reverse string is "+newStr);
		
		if(str.equals(newStr))
		{
			System.out.println("String is Palindrom");
		}
		else {
			System.out.println("String is not palindrom");
		}		
	}
}
