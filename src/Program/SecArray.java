package Program;

import java.util.Arrays;
import java.util.Scanner;

public class SecArray {
	
	static int secLarElement(int[] arr, int n)
	{
	    int sec=arr[n-1];
	    int count=1;
	    System.out.println("arraylength "+n);
	    for(int i=n-1; i>=0; i--)
	    {
	    	if( arr[i] != sec)
	    	{
	    		sec=arr[i];
	    		count++;	    		
	    	}
	    	if(count==2)
	    	{
	    		break;
	    	}
	    }
	    return sec;
	}
	
	static void display(int[] arr, int n)
	{
		for(int i=0; i<n; i++)
		{
			System.out.println(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub5
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		display(arr, n);
		int sec=secLarElement(arr, n);
		System.out.println(sec+ " is second large no");
	}
}
