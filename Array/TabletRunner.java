class TabletRunner{
	
	public static void main(String[] args){
		
		Tablet tablet = new Tablet();
		tablet.save("iPad");
		tablet.save("Samsung Tab");
		tablet.save("Lenovo Tab");
		tablet.save("Mi Pad");
		tablet.save("Realme Pad");
		
		tablet.search("Samsung Tab");
		tablet.search("Nokia Tab");
	}
}