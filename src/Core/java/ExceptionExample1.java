package Core.java;

public class ExceptionExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Exception handling");
		
		int a=10;
		int b=0;
		
		try {
			
			int c=a/b;			
			System.out.println(c);
			System.out.println("inside try block");
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("inside catch block");
			System.exit(0);
//			e.printStackTrace();
		}
//		catch(Exception c)
//		{
//			System.out.println("inside second catch block ");
//		}	
	
		finally {
			System.out.println("inside finally block");
		}
		
		
		

	}

}
