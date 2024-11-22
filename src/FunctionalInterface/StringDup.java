package FunctionalInterface;

import java.util.Scanner;

public class StringDup {
	static String removeDup(String str)
	{
		String strNew="";
		for(int i=0; i<=str.length()-1; i++)
		{
			char ch= str.charAt(i);			
				if(strNew.indexOf(ch)==-1)
				{
					strNew=strNew+ch;
				}			
		}
		return strNew;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.next();
        String newStr=removeDup(str);
        System.out.println(newStr);
	}
}
