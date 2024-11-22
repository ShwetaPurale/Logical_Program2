package purpleRadience;

import java.util.Scanner;

public class MissingWord1 {
	public static int findMissingNumber(int[] array, int n) {

		int expectedSum = (n * (n + 1)) / 2;

		int actualSum = 0;
		for (int num : array) {
			actualSum = actualSum+ num;
		}

		return expectedSum - actualSum;
	}

	public static void main(String[] args) {

//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter arr size");
//		int n=sc.nextInt();
//		int[] array=new int[n];
//		
//		System.out.println("enter element");
//		for (int i = 0; i <array.length; i++) {
//			array[i] = sc.nextInt();
//		}
		int[] array = { 1,2,4,5,10 };
		int n = 10;

		int missingNumber = findMissingNumber(array, n);
		System.out.println("The missing number is: " + missingNumber);
	}

}
