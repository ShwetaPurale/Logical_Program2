package Program;

import java.util.Scanner;

public class DupElement {
	
	static void dupWord(String str)
	{
		for(int i=0; i<str.length(); i++)
		{
			boolean unique=true;
			for(int j=0; j<str.length(); j++)
			{
				if(i!=j && str.charAt(i)==str.charAt(j))
				{
					unique=false;
					break;
				}
			}
			if(unique)
			{
				System.out.print(str.charAt(i));
				break;
			}
			
		}
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str=sc.next();

		dupWord(str);
		
	}

}
