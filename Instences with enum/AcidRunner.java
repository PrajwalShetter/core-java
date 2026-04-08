class AcidRunner{
	public static void main(String... args){
		AcidInfo info = new AcidInfo("ChemLab", "Testing");
		info.display();
		Acid acid = info.details();
		acid.display();
	}
}