class CardRunner{
	
	public static void main(String[] args){
		
		Game game = new Game(52, "3patti");
		game.display();
		
		Card card = game.details();
		card.display();
		
	}
}