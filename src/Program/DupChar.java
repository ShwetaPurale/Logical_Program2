package Program;

import java.util.Scanner;

public class DupChar {
	
	static String dupWord(String str)
	{
		String newStr="";
		
		for(int i=0; i<=str.length()-1; i++)
		{
			char ch=str.charAt(i);
			if(newStr.indexOf(ch) == -1)
			{
				newStr=newStr+ch;
			}			
		}
		return newStr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str=sc.next();
		
		String newStr=dupWord(str);
		System.out.println(newStr);
	}
}






