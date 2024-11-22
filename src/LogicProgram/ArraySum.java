package LogicProgram;

import java.util.Scanner;

public class ArraySum {	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a size");
         int size=sc.nextInt();
         int[][] arr=new int[size][size];
         System.out.println("enter element");
         for(int i=0; i<arr.length; i++)
         {
        	 for(int j=0; j<arr[i].length; j++)
        	 {
        		 arr[i][j]=sc.nextInt();
        	 }
         }
         
         for(int i=0; i<arr.length; i++)
         {
        	 for(int j=0; j<arr[i].length; j++)
        	 {
        		 System.out.print(arr[i][j]+" ");
        	 }
        	 System.out.println();
         }          
        
         
         System.out.println("Primary diagonal");
         int sum1=0;
 		for(int i= 0;i<size;i++)
 		{
 			for(int j=0;j<size;j++)
 			{
 				if(i==j) {
 					System.out.print(arr[i][j]+" ");
 					sum1=sum1+arr[i][j];
 				}
 			} 			
 		}
System.out.println("Secondary diagonal");
		int sum2=0;
		for(int i= 0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				if(i!=j && i+j==size-1) {
					System.out.print(arr[i][j]+" ");
					sum2=sum2+arr[i][j];
				}
			}
		} 		
 		System.out.println(sum1+sum2);
	}

}
