package LogicProgram;

import java.util.Arrays;
import java.util.Scanner;

public class ThirdLarge {
	
	static void display(int[] arr, int n)
	{
		for(int i=0; i<n; i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
	
	static int thirdLarge(int[] arr, int n)
	{
		Arrays.sort(arr);
		int thirdLargeEle=arr[n-1];
		int count=1;
		for(int i=n-2; i>=0; i--)
		{
			if(arr[i] != thirdLargeEle)
			{
				thirdLargeEle=arr[i];
				count++;
			}
			if(count==3)
			{
				break;
			}
		}
		return thirdLargeEle;
	}
	public static void main(String[] arge)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		display(arr, n);
		int element=thirdLarge(arr, n);
		System.out.println("Third large element "+element);
	}

}
