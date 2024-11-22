package GlobalCoding;

import java.util.Scanner;

public class MargeArray {
	
	static int[] margeArray(int[] arr1, int[] arr2)
	{
		int size1=arr1.length;
		int size2=arr2.length;
		
		int[] arr3=new int[size1+size2];
		
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array1 size");
		int size1=sc.nextInt();
		
		System.out.println("Enter array2 size");
		int size2=sc.nextInt();
		
		int[] arr1=new int[size1];
		int[] arr2=new int[size2];
		
		System.out.println("enter element for arr1");
		for(int i=0; i<size1; i++)
		{
			arr1[i]=sc.nextInt();
		}

		System.out.println("Enter element for arr2");
		for(int i=0; i<size2; i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		int[] arr3=margeArray(arr1, arr2);
		display(arr3);
	}

}



