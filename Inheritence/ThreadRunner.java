
class ThreadRunner{
	public static void main(String[] args){
		
		SewingThread th1 = new SewingThread("Cotton",100);
		SewingThread th2 = new SewingThread("Silk",150);
		
		th1.display();
		th2.display();
		
	}
}