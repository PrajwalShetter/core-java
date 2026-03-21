class CellRunner{

	public static void main(String[] args){

		Cell.cellProperties(); // Normal invoke

		Cell.cellProperties(2,4.5,'A',true); // Implicit invoke

		int nucleus = 1;
		double width = 3.8;
		char grade = 'B';
		boolean membrane = true;

		Cell.cellProperties(nucleus,width,grade,membrane); // Explicit invoke
	}
}