package Program;

import java.util.Scanner;

public class paramidStar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a No: ");
		int n=sc.nextInt();
		
		for(int i=0; i<=n; i++)
		{
			for(int j=0; j<=n-i; j++)
			{
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}