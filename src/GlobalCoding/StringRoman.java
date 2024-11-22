package GlobalCoding;

import java.util.Scanner;

public class StringRoman {
	
	static String convertIntToRoman(int n)
	{
		int[] val= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String[] val1= {"M", "CM", "D", "CD","C","XC","L","XL","X",
				"IX","V", "IV","I"};
		
		StringBuilder str=new StringBuilder();
		for(int i=0; i<val.length && n>0; i++)
		{
			while(n>=val[i]) {
				str.append(val1[i]);
				n=n-val[i];
			}
		}
		return str.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a No");
		int n=sc.nextInt();
		
		String str1=convertIntToRoman(n);
		System.out.println(str1);

	}

}
