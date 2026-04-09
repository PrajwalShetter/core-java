class Game{
	
	int noOfPlayers;
	String nameOfTheGame;
	
	Game(int noOfPlayers, String nameOfTheGame){
		
		this.noOfPlayers = noOfPlayers;
		this.nameOfTheGame = nameOfTheGame;
	}
	
	public void display(){
		
		System.out.println("noOfPlayers :"+this.noOfPlayers);
		System.out.println("nameOfTheGame :"+this.nameOfTheGame);
	}
	
	public Card details(){
		
		Card card = new Card(3.3, "playing card","plastic",52);
		return card;
	}
	
}