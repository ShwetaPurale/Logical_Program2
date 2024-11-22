import java.util.Arrays;
import java.util.Scanner;

public class SecLargeNo {
	
	static void display(int [] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			
			System.out.println(arr[i]);
		}		
	}
	
	static int secLarge(int[] arr)
	{
		int n=arr.length;
		System.out.println(n);
		int secLar=arr[n-1];
		int count=1;
		
		for(int i=n-1; i>=0; i--)
		{
			if(arr[i] != secLar)
			{
				secLar=arr[i];
				count++;
			}
			if(count==2)
			{
				break;
			}
		}
		return secLar;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter arr size");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		System.out.println("Enter element");
	    for(int i=0; i<arr.length; i++)
	    {
	    	arr[i]=sc.nextInt();
	    }
	    
	    display(arr);
	    Arrays.sort(arr);
	    int ele=secLarge(arr);
	    System.out.println("Second large element is "+ele);

	}

}
