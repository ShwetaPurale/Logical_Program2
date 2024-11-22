package LogicProgram;

import java.util.Scanner;

public class Marge2Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first array size");
		int size1=sc.nextInt();
		int[] arr1=new int[size1];
		
		System.out.println("enter first element");
		for(int i=0; i<size1; i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("enter second array size");
		int size2=sc.nextInt();
		int[] arr2=new int[size2];
		
		System.out.println("enter second element");
		for(int i=0; i<size2; i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		for(int i=0; i<size1; i++)
		{
			System.out.print(arr1[i]+" ");
		}
			
		System.out.println();
		for(int i=0; i<size2; i++)
		{
			System.out.print(arr2[i]+" ");
		}
		System.out.println();

		
		int[] arr3=new int[size1+size2];
		
		for(int i=0; i<size1; i++)
		{
			arr3[i]=arr1[i];
		}
		
		for(int i=0; i<size2; i++)
		{
			arr3[size1+i]=arr2[i];
		}
		
		for(int i=0; i<arr3.length; i++)
		{
		System.out.print(arr3[i]+" ");
		}
	}

}
