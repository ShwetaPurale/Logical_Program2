package Core.java;

public class ExceptionSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10, b=0;
		try {
			System.out.println("outer try block");
			
			try {
				int c=a/b;
				System.out.println(c);
				
			}
			catch(ArithmeticException e)
			{
				System.out.println("inner catch block");
			}
			
		}
		
		catch(Exception e)
		{
			System.out.println("outer catch block");
		}	

	}
}
