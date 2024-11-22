package FunctionalInterface;

import java.util.Scanner;

public class TwoDArray {
	
	static boolean searchVal(int[][] arr, int val)
	{
//		int a1=-1, a2=-1;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				if(arr[i][j]==val)
				{
				return true;
//					System.out.println("element found at row index "+arr[i]+"  col index "+arr[j]);
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size=sc.nextInt();
		int[][] arr=new int[size][size];
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		//printing Array
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Enter a Element for search");
		int val=sc.nextInt();
		boolean status= searchVal(arr, val);
		if(status)
		{
			System.out.println("element is found");
		}
		else {
			System.out.println("element is not found");
		}
	}

}
