
class CandleRunner{
	
	public static void main(String[] args){
		
		JugadCandle candle1= new JugadCandle("red", 50, "circle");
		candle1.color = "yellow";
		JugadCandle candle2= new JugadCandle("green", 50, "square");
		candle2.color = "purple";
		
		candle1.display();
		candle2.display();
		
	}
}