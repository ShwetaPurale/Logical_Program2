package LogicProgram;

import java.util.Scanner;

public class Fabonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int no=sc.nextInt();
		int a=0, b=1, sum=0;
		for(int i=0; i<no; i++)
		{
			sum=a+b;
			System.out.println(sum);
			a=b;
			b=sum;
			
		}

	}

}
