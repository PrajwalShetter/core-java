
class StockRunner{
	
	public static void main(String[] args){
		TradingStock stock1 = new TradingStock("Tata", 100, 20, "NSE", true);
		TradingStock stock2 = new TradingStock("MRF", 100, 50, "BSE", true);
		
		stock1.display();
		stock2.display();
	}
	
}