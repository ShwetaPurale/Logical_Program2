package Program;

//153=1*3+5*3+3+3 =153
//4256=4*4+2*4+5*4+6*4
import java.util.Scanner;

public class AmstrongNo {
	
	static double isAmrastrong(int n)
	{
		int rem=0, temp=n, digit=0;
		double sum=0;
		
		while(temp !=0)
		{
			digit++;
			temp=temp/10;
		}
		
		temp=n;
		while(temp != 0)
		{
			rem=temp%10;
			sum=sum+(Math.pow(rem, digit));
//			System.out.println(sum);
			temp=temp/10;			
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a No: ");
		int n=sc.nextInt();
		int temp=n; 
		double no=isAmrastrong(n);
		if(temp==no)
		{
			System.out.println(n+" is Amrstrong");
		}
		else {
			System.out.println(n+" is not Amrstrong");
		}
	}
}






