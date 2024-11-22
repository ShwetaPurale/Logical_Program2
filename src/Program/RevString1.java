package Program;

import java.util.Scanner;

public class RevString1 {
	
	static String revString(String str)
	{
		String newStr="";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			
			newStr=newStr+str.charAt(i);
		}
		return newStr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str=sc.next();
		
		String str1=revString(str);
		System.out.println(str1);

	}

}
