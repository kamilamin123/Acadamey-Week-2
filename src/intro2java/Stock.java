package intro2java;
public class Stock {
	private String tickerSymbol;
	private String companyName;
	private int price;
	private double percentChange;
	private int totalShares;
	private long marketCap;

    //create instance variables

    //constructor
	Stock(String tickerSymbol,String companyName, int price, int totalShares){
		this.tickerSymbol = tickerSymbol;
		this.companyName = companyName;
		this.price =price;
		this .totalShares= totalShares;
		this.marketCap = ((totalShares) *(price));
		this.percentChange=0;
		
	}
	 public void adjustPrice(int change){	
		 System.out.println(this.price);
		 this.price+=change;
		
		this.percentChange = (double) change / price * 100;
		this.marketCap = ((totalShares) *( price));
		
	}
	 
	 public String toString() {
		 return ("Ticker Symbol: "+this.tickerSymbol+"\n"+ "Company: "+this.companyName+"\n"
		 		+ "Current Price: $"+this.price+" ("+this.percentChange+"%)\n"
		 		+ "Market Cap: $"+this.marketCap);
	 }
	
    //create the methods 
   
   //Dont modify this code 
    public static void main(String[] args) {
        Stock stock = new Stock("GOOG", "Google, Inc.", 802, 6700);
        System.out.println(stock);
        stock.adjustPrice(20);
        System.out.println(stock);
    }
}
