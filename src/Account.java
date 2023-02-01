public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
       this.name = name;
       this.balance = balance;
    }
    public String toString(){
		return (name+", "+balance);
    }
    public boolean equals(Object otherobj) {
    	Account other = (Account) otherobj;
        return (this.balance == other.balance && this.name.equals(other.name));
   
    }
    public static void main(String[] args) {
    	Account a = new Account("kamil", 2000.5);
    	Account b = new Account("sami", 2000.5);
    	Account c = new Account("kamil", 2000.5);
    	SavingsAccount d = new SavingsAccount("kamil", 2000.5,.07);
    	SavingsAccount e= new SavingsAccount("sami", 2000.5,.07);
    	SavingsAccount f = new SavingsAccount("kamil", 2000.5,.07);
    	System.out.println(a.equals(b));
    	System.out.println(b.equals(c));
    	System.out.println(a.equals(c));
    	System.out.println(d.equals(e));
    	System.out.println(e.equals(f));
    	System.out.println(d.equals(f));

    }
}

class SavingsAccount extends Account {
    private double interestRate;
    public SavingsAccount (String name, double balance, double rate){
        super(name, balance);
        this.interestRate= rate;
    }
    public String toString(){
        return (super.toString()+", "+this.interestRate);
    
    }
    public boolean equals(Object otherobj) {
    	SavingsAccount other = (SavingsAccount) otherobj;
        return ( super.equals(otherobj) && this.interestRate ==other.interestRate);
    }
   


}