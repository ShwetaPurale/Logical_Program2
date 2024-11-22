package LogicProgram;

import java.util.Scanner;

public class StringRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.next();
		
		System.out.println(str);
		String newStr="";
		for(int i=str.length()-1; i>=0; i--)
		{
			newStr=newStr+str.charAt(i);
		}
		System.out.println(newStr);
	}

}
