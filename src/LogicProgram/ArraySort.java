package LogicProgram;

import java.util.Scanner;

public class ArraySort {

	static int[] sortAsc(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
//			System.out.print(arr[i]+" ");
		}
		return arr;
	}
	static void display(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}	
		System.out.println("unsorted array");
		display(arr);
		System.out.println("************");
       int[] arr1=sortAsc(arr);  
       System.out.println("sorted array");
       display(arr1);
	}
}
