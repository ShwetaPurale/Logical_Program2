package Collection;

class Bank
{
	private float balance;
	

	 Bank(float balance) {
		super();
		System.out.println("please wait balance retrieving");
		this.balance = balance;
	}

	public float getBalance() {
		System.out.println("your account is being created");
		return balance;
	}

	public void setBalance(float amountWithdrow) {
		if(balance>=amountWithdrow)
		{
			System.out.println("please wait setting new balance");
			balance=balance-amountWithdrow;
		}
		else {
			System.out.println("Invalid Balance");
		}
		
	}
	
}
public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank=new Bank(5000.0f);
		float currentBalance= bank.getBalance();
		System.out.println("your current balance is "+currentBalance);
		bank.setBalance(2000.0f);
		currentBalance=bank.getBalance();
		System.out.println("After withdrow balance "+currentBalance);

	}

	private ATM() {
		super();
		// TODO Auto-generated constructor stub
	}

}
