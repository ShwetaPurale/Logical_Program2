package Program;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnag {
	
	static boolean anagramString(String str1, String str2) {
		
		char[] charArr1=str1.toCharArray();
		char[] charArr2=str2.toCharArray();
		
		Arrays.sort(charArr1);
		Arrays.sort(charArr2);
		
		return Arrays.equals(charArr1, charArr2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first String: ");
		String str1=sc.next();
				
		System.out.println("Enter first String: ");
		String str2=sc.next();
		
		boolean status=anagramString(str1, str2);
		System.out.println("Both strings are Anagram "+status);

	}

}
