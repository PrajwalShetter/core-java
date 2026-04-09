class SandRunner{
	public static void main(String... args){
		SandInfo info = new SandInfo("Koppal", "Local");
		info.display();
		Sand sand = info.details();
		sand.display();
	}
}