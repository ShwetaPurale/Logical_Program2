import java.util.Scanner;

public class Percentage {
	
	public static void main(String[] argr)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks subject 1");
		float sub1=sc.nextFloat();
		System.out.println("enter marks subject 2");
		float sub2=sc.nextFloat();
		System.out.println("enter marks subject 3");
		float sub3=sc.nextFloat();
		System.out.println("enter marks subject 4");
		float sub4=sc.nextFloat();
		System.out.println("enter marks subject 5");
		float sub5=sc.nextFloat();
		
		if((sub1>=35 && sub1<=100) && (sub2>=35 && sub2<=100)
				&& (sub3>=35 && sub3<=100) && (sub4>=35 && sub4<=100)
				&& (sub5>=35 && sub5<=100))
		{
			float avg=0;
			avg=(sub1+sub2+sub3+sub4+sub5)/5;
			System.out.println("Avarage is "+avg);
		}
		else {
			System.out.println("student is fail");
		}
	}

}
