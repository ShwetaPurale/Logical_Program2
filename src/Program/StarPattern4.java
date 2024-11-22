package Program;

import java.util.Scanner;

public class StarPattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		int n=sc.nextInt();
		
		for(int i=0; i<=n; i++)
		{
			for(int j=0; j<=n; j++)
			{
				if(i==j || n-i==j)
				{
					System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		

	}

}
