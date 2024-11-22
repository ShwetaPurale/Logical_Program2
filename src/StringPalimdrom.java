import java.util.Scanner;

public class StringPalimdrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.next();
        String temp="";
        for(int i=str.length()-1; i>=0; i--)
        {
        	temp=temp+str.charAt(i);
        }
        System.out.println(temp);
        if(temp.equals(str))
        {
        	System.out.println("String is palimdrom");
        }
        else {
        	System.out.println("String is not palindrom");
        }
	}
}
