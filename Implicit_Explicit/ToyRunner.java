class ToyRunner{

	public static void main(String[] args){

		Toy.info(); // Normal invoke

		Toy.info(20,12.5,'T',true); // Implicit invoke

		int pieces = 15;
		double height = 10.2;
		char type = 'P';
		boolean electronic = false;

		Toy.info(pieces,height,type,electronic); // Explicit invoke
	}
}