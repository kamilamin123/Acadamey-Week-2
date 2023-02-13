package intro2java;
// InsufficientFundsException.java 
public class InsufficientFundsException extends Exception {


	public InsufficientFundsException(double amount,String message) {
		super(message+amount);
		
	}


}
