class AlloyRunner{
	
	public static void main(String[] args){
		
		Alloy alloy = new Alloy();
		alloy.save("Steel Alloy");
		alloy.save("Aluminium Alloy");
		alloy.save("Brass Alloy");
		alloy.save("Bronze Alloy");
		alloy.save("Titanium Alloy");
		
		alloy.search("Bronze Alloy");
		alloy.search("Iron Alloy");
	}
}