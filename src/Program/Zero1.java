package Program;

import java.util.Arrays;
import java.util.Scanner;

public class Zero1 {
	
	static void display(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n=sc.nextInt();
		
		  int[] arr = new int[n];
		  
		  for(int i=0; i<n; i++)
		  {
			  arr[i]=sc.nextInt();
		  }
		  Arrays.sort(arr);
		  display(arr);
		  
	        
//	        sort012(arr);
	        
//	        System.out.println("Sorted array: " +Arrays.sort(arr));
	    }
	    
//	    public static void sort012(int[] arr) {
//	        int low = 0;
//	        int mid = 0;
//	        int high = arr.length - 1;
//	        
//	        while (mid <= high) {
//	            switch (arr[mid]) {
//	                case 0:
//	                    // Swap arr[low] and arr[mid]
//	                    int temp0 = arr[low];
//	                    arr[low] = arr[mid];
//	                    arr[mid] = temp0;
//	                    low++;
//	                    mid++;
//	                    break;
//	                case 1:
//	                    mid++;
//	                    break;
//	                case 2:
//	                    // Swap arr[mid] and arr[high]
//	                    int temp2 = arr[high];
//	                    arr[high] = arr[mid];
//	                    arr[mid] = temp2;
//	                    high--;
//	                    break;
//	            }
//	        }
//
//	}

}
