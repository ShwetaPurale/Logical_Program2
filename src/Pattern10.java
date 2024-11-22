import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		
//		A B C D E 
//		B C D E F 
//		C D E F G 
//		D E F G H 
//		E F G H I 
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
        	
        	for(int j=1; j<=n; j++)
        	{
        		char count=(char)('A'+i+j-2);
        		System.out.print(count+" ");
//        		count++;
        	}
        	System.out.println();
        }
	}

}
