class DiamondRunner{
	public static void main(String... args){
		DiamondInfo info = new DiamondInfo("Tanishq", "Bangalore");
		info.display();
		Diamond diamond = info.details();
		diamond.display();
	}
}