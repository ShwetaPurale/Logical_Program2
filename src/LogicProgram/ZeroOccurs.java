package LogicProgram;

import java.util.Scanner;

public class ZeroOccurs {
	
	static void display(int[] arr, int n)
	{
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	static void zeroCount(int[] arr, int n)
	{
		int count=0;
		for(int i=0; i<n; i++)
		{
			if(arr[i]==0)
			{
				count=count+1;
			}
		}
		System.out.println("zero occurs "+count+ " times");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter element");
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}

		display(arr, n);
		System.out.println();
		zeroCount(arr, n);
	}

}
