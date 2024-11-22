package Core.java;

public class ExceptionThrows {
	
	void rtoOfficer() throws InterruptedException
	{
		System.out.println("RTO Officer");
		Thread.sleep(3000);
	}
	
	void rtoAgent() throws InterruptedException
	{
		rtoOfficer();
		System.out.println("RTO Agent");
	}
	
	void rtoOffice() throws InterruptedException
	{
		System.out.println("RTO Office");
		rtoAgent();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ExceptionThrows cust=new ExceptionThrows();
		cust.rtoOffice();

	}
}
