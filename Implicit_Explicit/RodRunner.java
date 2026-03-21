class RodRunner{

	public static void main(String[] args){

		Rod.specifications(); // Normal invoke

		Rod.specifications(2000, 35.6, 'B', true); // Implicit invoke

		int capacity = 1500;
		double corrosion = 28.9;
		char type = 'C';
		boolean heatResistant = false;

		Rod.specifications(capacity, corrosion, type, heatResistant); // Explicit invoke
	}
}