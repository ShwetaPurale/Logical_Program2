package Core.java;

import java.util.Arrays;
import java.util.Scanner;

public class MargeTwoArray {
	
	static int[] margeArray(int[] arr1, int[] arr2, int[] arr3, int size1, int size2)
	{
		for(int i=0; i<size1; i++)
		{
			arr3[i]=arr1[i];
		}
		
		for(int i=0; i<size2; i++)
		{
			arr3[size1+i]=arr2[i];
		}
		
		return arr3;
	}
	
	static void display(int[] arr3)
	{
		for(int i=0; i<arr3.length; i++)
		{
			System.out.print(arr3[i]+" ");
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first array size");
		int size1=sc.nextInt();
		int[] arr1= new int[size1];
		
		System.out.println("enter second array size");		
		int size2=sc.nextInt();
		int[] arr2= new int[size2];
		
		int size3=size1+size2;
		int[] arr3=new int[size3];
		
		System.out.println("enter first array element");
		for(int i=0; i<size1; i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("enter second array element");
		for(int i=0; i<size2; i++)
		{
			arr2[i]=sc.nextInt();
		}
		

	  arr3= margeArray(arr1, arr2, arr3, size1, size2);
		display(arr3);		

	}

}
