class LibraryStoreRunner{
	
	
	public static void main(String[] args){
		
		LibraryStore library = new LibraryStore();
		library.display();
		library.saveBook("Harry Potter");
		library.saveBook("Heli hogu karana");
		library.saveBook("poor dad and rich dad");
		library.saveBook("After love");
		library.saveBook("Justice");
		// library.saveBook("The monk who sold his ferrari");
		
		library.search("Heli hogu karana");
		
		library.display();
		
		library.update("After love","The power of subconsious Mind");
		library.display();
		
	}
}