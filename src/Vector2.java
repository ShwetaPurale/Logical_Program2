import java.util.Scanner;
import java.util.Stack;


public class Vector2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Stack<Integer> stObj=new Stack();
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<5; i++)
        {
        System.out.println("Enter any no: ");
        int no=sc.nextInt();
        int rev=0,rem=0;
        int temp=no;
        while(no>0)
        {
        	rem=no%10;
        	rev=(rev*10)+rem;
        	no=no/10;
        }
        if(temp==rev)
        {
        	stObj.push(temp);
//        	System.out.println("no is palimdrom");
        }
        else {
        	System.out.println("no is not palimdrom");
        }
	  }
        System.out.println(stObj);
	}
}
