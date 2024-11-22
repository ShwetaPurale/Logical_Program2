package map;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Vector<Integer> vecObj=new Vector();
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter no");
         int n=sc.nextInt();
         for(int i=1; i<=n; i++) {
        	 if(i%2==0)
         {
        	 vecObj.add(i);
         }
	}
	Iterator<Integer> itr=vecObj.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}

}
}