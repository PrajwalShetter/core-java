class ScrewRunner{

	public static void main(String[] args){

		Screw.specifications(); // Normal invoke

		Screw.specifications(150,1.75,'B',true); // Implicit invoke

		int capacity = 120;
		double pitch = 1.25;
		char type = 'C';
		boolean magnetic = false;

		Screw.specifications(capacity,pitch,type,magnetic); // Explicit invoke
	}
}