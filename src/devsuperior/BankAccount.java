package devsuperior;


public class BankAccount {
	
	private int numberAccount;
	private String accountHolder;
	private double accountBalance;
	
	public BankAccount() {}
	
	public BankAccount(int numberAccount, String accountHolder) {
		this.numberAccount = numberAccount;
		this.accountHolder = accountHolder;
	}
	
	public BankAccount(int numberAccount, String accountHolder, double accountBalance) {
		this.numberAccount = numberAccount;
		this.accountHolder = accountHolder;
		this.accountBalance = accountBalance;
	}
	
	public int getNumberAccount() {
		return numberAccount;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public String deposit(double value) {
		setAccountBalance(accountBalance + value);
		return "a" +  toString();
	}
	
	public String withdraw(double value) {
		setAccountBalance(accountBalance - value - 5.00);
		return "b" + toString();
	}

	@Override
	public String toString() {
		return String.format("Account: %d, Holder: %s, Balance: $%.2f", 
				this.getNumberAccount(), 
				this.getAccountHolder(), 
				this.getAccountBalance());
	}
	
	

}
