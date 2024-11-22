package Program;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a No: ");
		int n=sc.nextInt();
		int count=0;
		if(n<=1)
		{
			System.out.println("Enter valid No: ");
		}
		
		for(int i=2; i<n; i++)
		{					
			if(n%i==0)
			{
				System.out.println(n+" is not prime");
				count++;
				break;
			}			
		}
		
		if(count==0)
		{
			System.out.println(n+" is prime");
		}
	}
}



