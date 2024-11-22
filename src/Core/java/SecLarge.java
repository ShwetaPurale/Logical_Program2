package Core.java;

import java.util.Arrays;
import java.util.Scanner;

public class SecLarge {
	
	static void secLarge(int[] arr)
	{
		Arrays.sort(arr);
		
		int secLag=arr[arr.length-1];
		int count=1;
		for(int i=arr.length-2; i>=0; i--)
		{
			if(secLag != arr[i])
			{
				secLag=arr[i];
				count++;
			}
			if(count==2)
			{
				System.out.println("Second Large no: "+secLag);
			}
		}		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter elements");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		secLarge(arr);
	}
}
