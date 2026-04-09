class LockRunner{
	
	
	public static void main(String[] args){
		
		Locker locker = new Locker("mini", "home");
		locker.display();
		Lock lock = locker.details();
		lock.display();
	}
}