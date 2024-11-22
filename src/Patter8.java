import java.util.Scanner;

public class Patter8 {

	public static void main(String[] args) {
		
//		A B C D E 
//		A B C D E 
//		A B C D E 
//		A B C D E 
//		A B C D E 
		
//		A A A A A 
//		B B B B B 
//		C C C C C 
//		D D D D D 
//		E E E E E 		
		
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no: ");
        int n=sc.nextInt();
        for(int i=1; i<=n; i++)
        {
        	for(int j=1; j<=n; j++)
        	{
        		char ch=(char)('A'+i-1);
//        		char ch=(char)('A'+j-1);
        		System.out.print(ch+" ");
        	}
        	System.out.println();
        }
	}

}
