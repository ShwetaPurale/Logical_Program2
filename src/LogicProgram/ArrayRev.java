package LogicProgram;

import java.util.Scanner;

public class ArrayRev {
	static void display(int[] arr, int size)
	{
		for(int i=0; i<size; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	static void revArray(int[] arr, int size)
	{
		for(int i=size-1; i>=0; i--)
		{
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter array size");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		display(arr, size);
		System.out.println("reverse array is");
		revArray(arr, size);

	}

}
