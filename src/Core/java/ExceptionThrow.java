package Core.java;

public class ExceptionThrow {
	
	void withdrow(int amount) throws AmountException
	{
		int balance=5000;
		
		if(balance>amount)
		{
			System.out.println("withdrow successfully");
		}
		else
		{
//			System.out.println("invalid amount");
			throw new AmountException("Invalid amount");
		}
		
	}

	public static void main(String[] args) throws AmountException {
		// TODO Auto-generated method stub
		
		
		System.out.println("Inside main method");
		ExceptionThrow bal=new ExceptionThrow();
		bal.withdrow(6000);		

	}

}
