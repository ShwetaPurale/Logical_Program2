package Program;

import java.util.Arrays;
import java.util.Scanner;

public class CountStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str=sc.nextLine();
		int count=0;
		
		String[] newStr=str.split(" ");
		for(int i=0; i<=newStr.length-1; i++)
		{
			count++;
		}
		System.out.println(count);
		
		long count1=Arrays.stream(str.split("\\s+")).count();
		System.out.println(count1);

	}

}
