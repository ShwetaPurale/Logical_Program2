package Program;

import java.util.Scanner;

public class SplitString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str=sc.next();
		String str1=null;
		String [] newStr=str.split(" ");
		
		for(int i=0; i<=newStr.length-1; i++)
		{
			str1=str1+newStr[i];
			System.out.print(str1+" ");
		}

	}

}
