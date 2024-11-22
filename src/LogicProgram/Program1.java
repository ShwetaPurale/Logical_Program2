package LogicProgram;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=9;
        for(int i=0; i<n; i++)
        {
        	for(int j=0; j<=i; j++)
        	{
        		System.out.print(count);
        	}
        	count=count-3;
        	System.out.println();
        }
	}

}
