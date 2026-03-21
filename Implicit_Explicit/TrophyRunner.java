class TrophyRunner{

	public static void main(String[] args){

		Trophy.trophyDetails(); // Normal invoke

		Trophy.trophyDetails(100,12.5,'G',true); // Implicit invoke

		int points = 80;
		double width = 10.2;
		char type = 'S';
		boolean shiny = false;

		Trophy.trophyDetails(points,width,type,shiny); // Explicit invoke
	}
}