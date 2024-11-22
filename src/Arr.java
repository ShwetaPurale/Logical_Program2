import java.util.Arrays;

public class Arr {

	static int findThirdLargest(int arr[])
	{
		Arrays.sort(arr);
		int n=arr.length;
		System.out.println(n);
		int thirdLargest=arr[n-1];
		
		int count=1;
		
		for(int i=n-2; i>=0; i--)
		{
			if(arr[i] !=thirdLargest)
			{
			thirdLargest=arr[i];
			count++;
			}
			
			if(count==3)
			{
				break;
			}
		}
		
		return thirdLargest;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1, 2, 8, 16, 66, 21,52,63};
		int thirdLargest= findThirdLargest(arr);
		
		System.out.println("Third largest no "+thirdLargest);
 	}

}
