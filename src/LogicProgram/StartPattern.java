package LogicProgram;

import java.util.Scanner;

public class StartPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a no");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			for(int space=i; space<n; space++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{ 
//				System.out.print("* ");
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
