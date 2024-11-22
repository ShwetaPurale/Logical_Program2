package LogicProgram;

import java.util.Scanner;

public class RemoveWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a String");
		String str=sc.nextLine();
		
		System.out.println("enter a word");
		String word=sc.next();
		
		str=str.replaceAll(word, "");
		str=str.trim();
		System.out.println(str);
		

	}

}
