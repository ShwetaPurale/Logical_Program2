package LogicProgram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

//Input: [1, 2, 3, 4, 2, 5, 6, 3]
//Output: [2, 3]

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner sc=new Scanner(System.in);
		int[] arr= {1,2,3,4,2,5,6,3};	
		
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
			if(i!=j && arr[i]==arr[j])
			{		
				System.out.println(arr[j]);
			}
			
			}
		}
		
		
		
		

	}

}
