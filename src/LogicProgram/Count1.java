package LogicProgram;

import java.util.Scanner;

public class Count1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no");
		int no = sc.nextInt();
		int temp = no;

		int rev = 0, rem = 0, count = 0;
		while (no != 0) {
			rem = no % 10;
			rev = rev * 10 + rem;
			no = no / 10;

			if (rem == 1 || rem == -1) {
				count = count + 1;
			}
		}
		System.out.println(count);
	}

}
