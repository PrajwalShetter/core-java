class LeafRunner{

	public static void main(String[] args){

		Leaf.properties(); // Normal invoke

		Leaf.properties(80,5.5,'B',true); // Implicit invoke

		int chlorophyll = 60;
		double width = 4.2;
		char type = 'C';
		boolean evergreen = false;

		Leaf.properties(chlorophyll,width,type,evergreen); // Explicit invoke
	}
}