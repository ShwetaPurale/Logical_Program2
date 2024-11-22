package singleTon.pattern;

public class Customer {
	
	private int customerId;
	public String customerName;
	private long customerPhone;
	private Customer(int customerId, String customerName, long customerPhone) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerPhone = customerPhone;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(long customerPhone) {
		this.customerPhone = customerPhone;
	}
	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerPhone="
				+ customerPhone + "]";
	}
	
//	Egar singleTon pattern
//	static Customer c=new Customer(108, "Rahul", 4578962L);
//	
//	static Customer getInstance()
//	{
//		return c;
//	}
	
	
//	Lazy singleTon pattern
	static Customer c;
	
	static Customer getInstance()
	{
		if(c==null)
		{
		c= new Customer(108, "Rahul", 4578962L);
		}
		return c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c1=getInstance();
		Customer c2=getInstance();
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());

	}	

}
