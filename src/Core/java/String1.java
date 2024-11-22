package Core.java;

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a String");
         String str=sc.nextLine();
         String[] newStr=str.split("\\s");        
         String newString=newStr[1]+" "+newStr[0];
         System.out.println(newString); 
//         sc.nextLine();
	}
}
