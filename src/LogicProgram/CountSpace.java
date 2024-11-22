package LogicProgram;

import java.util.Scanner;

public class CountSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = "I am learning at the kiran academy";
//		String[] str1=str.split("//s");

		int count = 1;
		for (int i = 0; i < str.length(); i++) {

			
				if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
					count++;
				}
			
		}
		System.out.println(count);

	}

}
