package LogicProgram;

import java.util.Scanner;

public class product {
	
	static void display(int[] arr, int n)
	{
	for(int i=0; i<n; i++)
	{
		System.out.print(arr[i]+" ");;
	}
	}
	
	static int[] prodEle(int[] arr, int n)
	{
		
		for(int i=0; i<n; i++)
		{
			int prod=1;
			for(int j=0; j<n; j++)
			{
				if(i != j)
				{
					prod=prod*arr[j];
				}
			}
			arr[i]=prod;
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		display(arr, n);
		arr=prodEle(arr, n);
		System.out.println();
		display(arr, n);

	}

}
