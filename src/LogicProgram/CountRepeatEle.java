package LogicProgram;

import java.util.Scanner;

public class CountRepeatEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.next();
//        String newStr="";
        int count=0;
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
        		System.out.println("non-repeated element is: "+str.charAt(i));
        		break;
        	}
        }
	}

}
