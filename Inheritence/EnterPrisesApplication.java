
class EnterPrisesApplication extends WebApplication{
	
	void startServer(){
		System.out.println("start server running from enterpriseapplication");
	}
	
	@Override
	void sendEmail(){
		
		System.out.println("Eamail is running in EnterPrisesApplication");
	}
	
}