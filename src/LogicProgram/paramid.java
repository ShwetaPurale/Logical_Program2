package LogicProgram;

import java.util.Scanner;

public class paramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter a no");
          int n=sc.nextInt();
          for(int i=0; i<=n; i++)
          {
        	  for(int j=0; j<=n-i-1; j++)
        	  {
        		  System.out.print(" ");
        	  }
        	  for(int j=0; j<=i; j++)
        	  {
        		  System.out.print("* ");
        	  }
        	  System.out.println();
          }
//          reverse paramid
          for(int i=n; i>=0; i--)
          {
        	  for(int j=0; j<=n-i-1; j++)
        	  {
        		  System.out.print(" ");
        	  }
        	  for(int j=0; j<=i; j++)
        	  {
        		  System.out.print("* ");
        	  }
        	  System.out.println();
          }
	}

}
