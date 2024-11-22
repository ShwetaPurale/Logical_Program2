package purpleRadience;

import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.next();
		String newStr="";
		
		for(int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			if(newStr.indexOf(ch)==-1)
			{
				newStr=newStr+str.charAt(i);
			}
		}
		System.out.println(newStr+" "+newStr.length());

	}

}
