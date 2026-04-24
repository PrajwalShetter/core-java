class Surf{
	
	void browser(Browser browser){
		
		browser.search();
		
		if(browser instanceof ChromeBrowser){
			System.out.println("Browser is a chromebrowser");
			
			ChromeBrowser cb = (ChromeBrowser) browser; 
			cb.popular();
		}
		else if(browser instanceof FireFoxBrowser){
			System.out.println("browser is a FireFoxBrowser");
			
			FireFoxBrowser fb = (FireFoxBrowser) browser; 
			fb.fastSearch(); 
		}
		else{
			System.out.println("Browser is in browser");
		}
		
		
	}
}