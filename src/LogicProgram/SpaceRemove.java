package LogicProgram;

import java.util.Scanner;

public class SpaceRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String str=sc.nextLine();
		
//		String str1="";
//		for(int i=0; i<str.length()-1; i++)
//		{
//			if(str.charAt(i)!=' ' && (str.charAt(i+1)==' '))
//			{
//				str1=str1+str.charAt(i);
//			}
//		}
		
		String str1=str.replaceAll(" ","");
		System.out.println(str1);
		

	}

}
