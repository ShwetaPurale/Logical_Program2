package LogicProgram;
import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no: ");
        int n=sc.nextInt();
        int count=1;
        for(int i=1; i<=n; i++)
        {
        	for(int j=1; j<=n; j++)
        	{
        		System.out.print(count+" ");
        	}
        	System.out.println();
        }
	}

}
