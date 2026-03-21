class ThreadRunner{

	public static void main(String[] args){

		Thread.threadDetails(); // Normal invoke

		Thread.threadDetails(300,45.5,'C',true); // Implicit invoke

		int length = 250;
		double durability = 38.9;
		char type = 'B';
		boolean colored = false;

		Thread.threadDetails(length,durability,type,colored); // Explicit invoke
	}
}