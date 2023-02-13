package intro2java;
// BankAccount.java
public class BankAccount {

	private double balance;
	private String accountNumber;

	public BankAccount(String accountNumber, double balance) {
		this.accountNumber =  accountNumber;
				this.balance = balance;
	}

	public void withdraw(double amount) throws InsufficientFundsException, InvalidAmmount {
		if (amount <= 0) {
			throw new InvalidAmmount(amount,"please enter valid amount to withdraw: ");
		}
		if (amount > balance) {
			double needs = amount - balance;
			throw new InsufficientFundsException(needs,"insufficient fund this account needs: ");
		}else {
		balance -= amount;}
	}
	
	
	public void  depositMoney(double amount) throws InvalidAmmount {
		if (amount <= 0) {
			throw new InvalidAmmount(amount,"please enter valid amount to deposit");
		}else {
		balance += amount;}
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}


}
