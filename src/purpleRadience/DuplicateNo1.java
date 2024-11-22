package purpleRadience;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateNo1 {
	public static int[] removeDuplicates(int[] array) {

		Arrays.sort(array);

		int unique = 1;
		for (int i = 1; i < array.length; i++) {
			if (array[i] != array[i - 1]) {
				unique++;
			}
		}

		int[] result = new int[unique];
		result[0] = array[0];
		int index = 1;

		for (int i = 1; i < array.length; i++) {
			if (array[i] != array[i - 1]) {
				result[index++] = array[i];
			}
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter arr size");
		int n=sc.nextInt();
		int[] array=new int[n];
		
		System.out.println("enter element");
		for (int i = 0; i <array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.println("Original Array: " + Arrays.toString(array));

		int[] result = removeDuplicates(array);

		System.out.println("Array after removing duplicates: " + Arrays.toString(result));
	}

}
