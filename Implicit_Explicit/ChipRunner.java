class ChipRunner{

	public static void main(String[] args){

		Chip.chipDetails(); // Normal invoke

		Chip.chipDetails(64,3.5,'X',true); // Implicit invoke

		int memory = 32;
		double freq = 2.8;
		char type = 'Y';
		boolean secure = false;

		Chip.chipDetails(memory,freq,type,secure); // Explicit invoke
	}
}