package LogicProgram;

import java.util.Scanner;

public class Array2D {
	static boolean searchElement(int[][] arr, int val)
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				if(arr[i][j]==val)
				{
					return true;
				}
			}
		}
		return false;
	}	

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
         System.out.println("Enter a value for search ");
         int val=sc.nextInt();
         boolean status=searchElement(arr, val);
         if(status)
         {
        	 System.out.println("element is found");
         }
         else{
        	 System.out.println("element is not found");
         }
	}
}
