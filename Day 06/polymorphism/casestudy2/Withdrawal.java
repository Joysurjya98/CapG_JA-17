package polymorphism.casestudy2;

public class Withdrawal extends Transaction {
double amount;
	
	/**
	 * 
	 */
	public Withdrawal() {
		super();
	}

	
	/**
	 * @param amount
	 */
	public Withdrawal(int accountNum,double amount) {
		super(accountNum);
		this.amount = amount;
	}

	
	/**
	 * @return the amount
	 */
	public Double getAmount() {
		return amount;
	}


	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}


	public void execute(double balance) {
		super.execute();
		balance = balance-amount;
		System.out.println("Balance: "+balance);
	}

}
