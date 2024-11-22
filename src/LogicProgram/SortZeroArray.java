package LogicProgram;

/* input[1 0 2 0 8 0 6 9]
 * output[1 2 8 6 9 0 0 0]
 */
 
import java.util.Scanner;

public class SortZeroArray {
	static int[] customArray(int arr[])
	{
		int k=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]!=0)
			{
				arr[k]=arr[i];
				k++;
			}
		}
		for(int i=k; i<arr.length; i++)
		{
			arr[i]=0;
		}
		return arr;
	}
	
	static void display(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
        {        	
        		System.out.print(arr[i]+" ");        
        }
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("enter the element");
        for(int i=0; i<size; i++)
        {        	
        		arr[i]=sc.nextInt();        
        }
       display(arr);
       System.out.println("***************");
       arr=customArray(arr);
       display(arr);
	}

}
