class JuiceRunner{
	
	public static void main(String[] args){
		
		Juice juice = new Juice();
		juice.save("Orange Juice");
		juice.save("Apple Juice");
		juice.save("Mango Juice");
		juice.save("Grape Juice");
		juice.save("Pineapple Juice");
		
		juice.search("Mango Juice");
		juice.search("Banana Juice");
	}
}