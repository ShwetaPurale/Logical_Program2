package LogicProgram;

import java.util.Scanner;

public class NextPalim {
	
	static boolean nextNumber(int no)
	{
		int rev=0, rem=0, temp=no;
		if(no != 0)
		{
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		return temp==rev;
	}
	
	static int NextPali(int no)
	{
		while(true)
		{
			no++;
			if(nextNumber(no))
			{
				return no;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		int no=sc.nextInt();
		
		int temp=NextPali(no);
		System.out.println("the next palindrom is "+temp);

	}

}
