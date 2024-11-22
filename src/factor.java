import java.util.Scanner;

public class factor {

	public static void printFactor(int n)
	{
		for(int i=1; i<=n; i++)
		{
			if(n%i==0)
			{
				System.out.println(i+" ");
			}			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int a=sc.nextInt();
		printFactor(a);		

	}

}
