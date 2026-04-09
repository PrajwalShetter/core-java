class BoxRunner{
	
	public static void main(String[] args){
		
		Pearl pearlOne = new Pearl("White",PearlType.NATURAL,5000);
		Pearl pearlTwo = new Pearl("Pink",PearlType.CULTURED,3000);
		
		Pearl pearls[] = {pearlOne,null,pearlTwo,null};
		
		Box box = new Box(2.5,10,5,pearls);
		box.display();
	}
}