package LogicProgram;

import java.util.Scanner;

public class patternNimap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no");
		int no = sc.nextInt();
		int count = 1;

		for (int i = 1; i < no; i++) {
			for (int j = 1; j <= 10; j++) {
				
				if (count <= no) {

					if (j <= 5) {
						System.out.print(count + " ");

					} else {
						System.out.print("* ");
					}
					count++;
				}
			}
			System.out.println();

		}
	}
}
//1 2 3 4 5 * * * * *
//11 12 13 14 15 * * * * * 
//21 22 22
