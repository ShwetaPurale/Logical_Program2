package LogicProgram;

import java.util.Scanner;

public class TwoDArray {
	static void display(int[][] arr)
	{
		for(int i=0; i<arr.length; i++)
        {
        	for(int j=0; j<arr[i].length; j++)
        	{
        		System.out.print(arr[i][j]+" ");
        	}
        	System.out.println();
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int size=sc.nextInt();
        int[][] arr=new int[size][size];
        System.out.println("enter the element");
        for(int i=0; i<arr.length; i++)
        {
        	for(int j=0; j<arr[i].length; j++)
        	{
        		arr[i][j]=sc.nextInt();
        	}
        }
       display(arr);
	}

}
