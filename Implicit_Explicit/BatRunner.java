class BatRunner{

	public static void main(String[] args){

		Bat.batDetails(); // Normal invoke

		Bat.batDetails(200,10.5,'K',true); // Implicit invoke

		int runs = 150;
		double width = 9.8;
		char type = 'S';
		boolean professional = false;

		Bat.batDetails(runs,width,type,professional); // Explicit invoke
	}
}