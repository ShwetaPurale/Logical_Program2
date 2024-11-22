package LogicProgram;

import java.util.Scanner;

/*
 * input[2   3   4]
 * logic[3*4 3   4
 *       2   2*4 4
 *       2   3   2*3] 
 *       output[12 8 6]     
 * */
public class ProductOfElement {

	static void display(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
        {
        	
        		System.out.print(arr[i]+" ");
        	}
        	System.out.println();        
	}
	
	static int[] ElementProduct(int[] arr)
	{
		int arr1[]=new int[arr.length];
		for(int i=0; i<arr.length; i++)
		{
			int prod=1;
			for(int j=0; j<arr.length; j++)
			{
				if(i!=j)
				{
					prod=prod*arr[j];
				}
			}
			arr1[i]=prod;
		}
		return arr1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        System.out.println("enter size of array");
	        int size=sc.nextInt();
	        int[] arr=new int[size];
	        System.out.println("enter the element");
	        for(int i=0; i<arr.length; i++)
	        {	        	
	        	arr[i]=sc.nextInt();	        
	        }
	       display(arr);
	       System.out.println("***********");
	       arr=ElementProduct(arr);
	       display(arr);
	}

}
