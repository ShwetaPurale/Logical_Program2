package LogicProgram;

import java.util.Scanner;

public class ArrayDupEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.next();
        String newStr="";
        for(int i=0; i<str.length(); i++)
        {
        	char ch=str.charAt(i);
        	if(newStr.indexOf(ch)==-1)
        	{
        		newStr=newStr+ch;	
        	}
        }
        System.out.println(newStr);
	}
}
