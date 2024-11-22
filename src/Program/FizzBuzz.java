package Program;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a No: ");
		int n=sc.nextInt();
		
		for(int i=0; i<=n; i++)
		{
			if(i%3==0)
			{
				System.out.println("Fizz "+i);
			}
			else if(i%5==0)
			{
				System.out.println("Buzz "+i);
			}
			
			if(i%3==0 && i%5==0)
			{
				System.out.println("FizzBuzz "+i);
			}
		}
	}
}
