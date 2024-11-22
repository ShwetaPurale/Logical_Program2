package LogicProgram;

import java.util.Scanner;

public class TwoDArrayOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of row");
		int size1 = sc.nextInt();
		System.out.println("Enter size of column");
		int size2 = sc.nextInt();
		int a[][] = new int[size1][size2];
		for(int i= 0;i<size1;i++)
		{
			for(int j=0;j<size2;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i= 0;i<size1;i++)
		{
			for(int j=0;j<size2;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Primary diagonal");
		
		for(int i= 0;i<size1;i++)
		{
			
			for(int j=0;j<size2;j++)
			{
				if(i==j) {
					System.out.print(a[i][j]+" ");
				}				
			}
			
		}
				
		System.out.println();
		
		System.out.println("Secondary diagonal");
		
		for(int i= 0;i<size1;i++)
		{
			for(int j=0;j<size2;j++)
			{
				if(i+j==size1-1) {
					System.out.print(a[i][j]+" ");
				}
			}
		}
		System.out.println();
//			
		//		TwoDArray o = new TwoDArray();
//		o.display(a);

		System.out.println("Lower Triangle");
		for(int i= 0;i<size1;i++)
		{
			for(int j=0;j<size2;j++)
			{
				if(j<=i) {
					System.out.print(a[i][j]+" ");
				}
			}
			System.out.println();
			
		}
		
		
		System.out.println("Upper Triangle");
	for(int i= 0;i<size1;i++)
		{
			for(int j=0;j<size2;j++)
			{
				if(i>j) {
					System.out.print("  ");
				}
				else {
					System.out.print(a[i][j]+" ");
				}

			}
			System.out.println();
			
		}

	}

}
