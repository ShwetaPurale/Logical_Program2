package LogicProgram;

import java.util.Arrays;
import java.util.Scanner;

public class SortByZero {
	
	static void display(int[] arr, int n)
	{
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	static int[] sortZero(int[] arr, int n)
	{
		int k=0;
		for(int i=0; i<n; i++)
		{
			if(arr[i] != 0)
			{
				arr[k]=arr[i];
				k++;
			}
		}
		for(int i=k; i<n; i++)
		{
			arr[i]=0;
		}
		return arr;
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter element");
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		
//		display(arr, n);
		
		sortZero(arr, n);
		Arrays.sort(arr);
		display(arr, n);
		
	}

}
