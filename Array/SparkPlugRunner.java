class SparkPlugRunner{
	
	public static void main(String[] args){
		
		SparkPlug plug = new SparkPlug();
		plug.save("NGK Plug");
		plug.save("Bosch Plug");
		plug.save("Denso Plug");
		plug.save("Champion Plug");
		plug.save("Autolite Plug");
		
		plug.search("Bosch Plug");
		plug.search("Honda Plug");
	}
}