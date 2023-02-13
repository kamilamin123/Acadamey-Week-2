package intro2java;

public class InvalidAmmount extends Exception {
	public InvalidAmmount(double amount,String message){
		super(message+amount);
	}

}
