package purpleRadience;

import java.util.Scanner;

public class DupElement {

	static void removeDup(int[] arr, int n) {
		// TODO Auto-generated method stub
//		int[] arr1 = new int[n];
		int j = 0;
		for (int i = 0; i < arr.length - 1; i++) {

			if (i != j && arr[i] != arr[i + 1]) {
//					continue;
				arr[j++] = arr[i];
			}

		}
		arr[j++] = arr[arr.length - 1];
		for (int i = 0; i < j; i++) {
			System.out.print(arr[i]);
		}

	}

	static void display(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter element");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		display(arr, n);
		removeDup(arr, n);

	}

}
