package GlobalCoding;

import java.util.Scanner;

public class StarPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a No: ");
		int n=sc.nextInt();
		
		for(int i=0; i<=n; i++)
		{
			for(int j=0; j<=n-i; j++)
			{
//				if(i<=2 && j==1)
//				{
					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}			
				
			}
			System.out.println();
		}

	}

}
