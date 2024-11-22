package LogicProgram;

import java.util.Scanner;

public class ArrayProd {
	
	void display(int[] arr, int n)
	{
		for(int i=0; i<n; i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
	
	int[] elementProd(int[] arr, int n)
	{
		int[] arr1=new int[n];
		for(int i=0; i<n; i++)
		{
			int prod1=1;
			for(int j=0; j<n; j++)
			{
				if(i!=j)
				{
					prod1=prod1*arr[j];
				}
			}
			arr1[i]=prod1;
		}
		return arr1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayProd prod=new ArrayProd();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter array element");
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		prod.display(arr, n);
		arr=prod.elementProd(arr, n);
		prod.display(arr, n);

	}

}
