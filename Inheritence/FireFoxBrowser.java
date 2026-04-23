class FireFoxBrowser extends Browser{
	
	void secure(){
		System.out.println("Running secure in FireFoxBrowser");
	}
	
	@Override
	void search(){
		System.out.println("Running search in FireFoxBrowser");
	}
	
	void fastSearch(){
		System.out.println("Running fastSearch in FireFoxBrowser");
		this.search();
		super.search();
	}
	
}