package GlobalCoding;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
	
	static void display(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		System.out.println("Enter element");
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);		
		display(arr);

	}
	

}
