package LogicProgram;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no");
		int n=sc.nextInt();
		
		for(int i=0; i<= n; i++)
		{
			for(int j=0; j<=n-i-1; j++)
			{
				System.out.print(" ");
				
			}
			
			for(int j=0; j<=i; j++)
			{
				if(n+i-j<=0 && n+i-j>0)
				{
					System.out.print(j);
				}
				else
				{
				System.out.print("* ");
				}
			}
			System.out.println();
		}

	}
}
