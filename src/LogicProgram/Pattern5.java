package LogicProgram;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
         System.out.println("Enter a no: ");
         int n=sc.nextInt();
         int count=1;
         for(int i=1; i<=n; i++)
         {
        	 for(int j=1; j<=i; j++)
        	 {
//        		 System.out.print("* ");
//        		 System.out.print(i+" ");
        		 System.out.print(count+" ");
        		 count++;
        	 }
        	 System.out.println();
         }
	}

}
