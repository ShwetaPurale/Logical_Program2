import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		
//		A B C D E 
//		F G H I J 
//		K L M N O 
//		P Q R S T 
//		U V W X Y 		
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no: ");
        int n=sc.nextInt();
        char ch='A';
        for(int i=1; i<=n; i++)
        {        	
        	for(int j=1; j<=n; j++)
        	{        		
        		System.out.print(ch+" ");
        		ch++;
        	}
        	System.out.println();
        }
	}
}
