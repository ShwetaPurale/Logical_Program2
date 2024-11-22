package purpleRadience;

import java.util.Arrays;
import java.util.Scanner;

public class MargeTwoArray {

	static void display(int[] arr1, int[] arr2, int size1, int size2)
	{
		for (int i = 0; i < size1; i++) 
		{
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		for(int i=0; i<size2; i++)
		{
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
	}
	
	static int[] margeArray(int[] arr1, int[] arr2, int[] arr3, int size1, int size2) {
		
		for(int i=0; i<size1; i++)
		{
			arr3[i] = arr1[i];
		}
		
		for(int i=0; i<size2; i++)
		{
			arr3[size1+i]=arr2[i];
		}
		return arr3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter arr1 size");
		int size1 = sc.nextInt();
		int[] arr1 = new int[size1];
		
		
		System.out.println("enter arr2 size");
		int size2 = sc.nextInt();
		int[] arr2 = new int[size2];
		
		int[] arr3=new int[size1+size2];

		System.out.println("enter arr1 element");
		for (int i = 0; i < size1; i++) {
			arr1[i] = sc.nextInt();
		}

		System.out.println("enter arr2 element");
		for (int i = 0; i < size2; i++) {
			arr2[i] = sc.nextInt();
		}

		display(arr1, arr2, size1, size2);
	  int[] arr=margeArray(arr1, arr2, arr3, size1, size2);
	  Arrays.sort(arr);
	  for(int i=0; i<arr.length; i++)
	  {
		  System.out.print(arr[i]+" ");
	  }

	}

	

}
