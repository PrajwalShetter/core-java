class WebApplication extends Application{
	
	void sendEmail(){
		
		System.out.println("Eamail is running in webapplication");
	}
	
	@Override
	void install(){
		System.out.println("install is running in webapplication");
	}
}