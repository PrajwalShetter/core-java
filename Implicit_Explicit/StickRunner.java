class StickRunner{

	public static void main(String[] args){

		Stick.stickInfo(); // Normal invoke

		Stick.stickInfo(80,4.5,'W',true); // Implicit invoke

		int strength = 70;
		double width = 3.8;
		char type = 'B';
		boolean bamboo = false;

		Stick.stickInfo(strength,width,type,bamboo); // Explicit invoke
	}
}