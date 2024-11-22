package LogicProgram;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter a no: ");
           int n=sc.nextInt();
           int count=0;
           if(n==0)
           {
        	   System.out.println("Invalid no");
           }
           for(int i=2; i<n; i++)
           {
        	   if(n%i==0)
        	   {
        		   System.out.println("No is not Prime ");
        		   count=1;
        		   break;
        	   }        	  
           }
           if(count==0)
           {
        	   System.out.println("No is Prime");
           }
           
	}

}
