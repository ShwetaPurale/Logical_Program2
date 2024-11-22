package LogicProgram;

import java.util.Scanner;

public class PerfectNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("enter a no");
         int n=sc.nextInt();
         switch(n)
         {
         case 1:
        	 if(n%2==0)
        	 {
        	 System.out.println("perfect no");
        	 }
        	 break;
         case 2:
        	  int reverse=0,reminder=0, temp=0;
     		while(n!=0){
     			temp=n;
     			 reminder=n%10;
     			reverse=(reverse*10)+reminder;
     			n = n/10;
     		}
     		if(reverse==temp)
     		{
     			System.out.println("no is palindrom");
     		}
     		else{
     			System.out.println("no is not palindrom");
     		}
     		break;
         case 3:
        	 int count=0;
        	 for(int i=2; i<n; i++)
        	 {
        		 if(n%i==0)
        		 {
        			 System.out.println("no is not prime");
        			 count=1;
        			 break;
        		 }
        	 }
        	 if(count==0)
        	 {
        		 System.out.println("no is prime");
        	 }
        	 break;
        	 default:System.out.println("It is not valid");
        	 }
         }
	}


