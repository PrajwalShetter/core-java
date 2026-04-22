class AppTester{
	
	public static void main(String[] args){
		
		Application app = new WebApplication();
		app.install();
		
		WebApplication web = new EnterPrisesApplication();
		web.sendEmail();
	}
}