package purpleRadience;

import java.util.Scanner;

public class RotateMatrix {
	
	static void rotateMatrix(int[][] arr, int row, int col) {
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[row-i-j]);
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter row size");
		int row = sc.nextInt();
		
		System.out.println("enter col size");
		int col = sc.nextInt();
		int[][] arr = new int[row][col];
		
		System.out.println("enter element");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		rotateMatrix(arr, row, col);

	}

	

}
