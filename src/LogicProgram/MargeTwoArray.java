package LogicProgram;

import java.util.Arrays;

public class MargeTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr1= {5,15,24,3};
       int[] arr2= {42,12,5,18};
       
       int a=arr1.length;
       int b=arr2.length;
       
       int n= a+b;
       int[] arr3=new int[n];
       

       for(int i=0; i<a; i++)
       {
    	   arr3[i]=arr1[i];
       }
       for(int i=0; i<b; i++)
       {
    	   arr3[a+i]=arr2[i];
       }
       
       Arrays.sort(arr3);
       for(int i=0; i<arr3.length; i++)
       {
    	   System.out.print(arr3[i]+" ");
       }
	}

}
