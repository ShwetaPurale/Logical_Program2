package Program;

import java.util.Scanner;

public class CountWorld {
	
	static int wordCount(String str)
	{
		int count=0;
		if(str.charAt(0)!=' ')
		{
			count++;
		}
		
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i) == ' ' && str.charAt(i+1) != ' ')
			{
				count++;
			}
		}
		return count;
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str=sc.nextLine();
		
		int count=wordCount(str);
		System.out.println(count);
		
	}

}
