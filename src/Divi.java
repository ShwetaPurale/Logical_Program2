import java.util.Scanner;

public class Divi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int n=sc.nextInt();
		
		if(n%41==0 && n%61==0)
		{
			System.out.println("Foo Bar");
		}
		else if(n%41==0)
		{
			System.out.println("Foo");
		}
		else if(n%61==0)
		{
			System.out.println("Bar");
		}
		else {
			System.out.println("Not divisible by 41 & 61");
		}
	}

}
