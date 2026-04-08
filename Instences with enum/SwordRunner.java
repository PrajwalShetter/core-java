class SwordRunner{
	public static void main(String... args){
		SwordInfo info = new SwordInfo("India", "War");
		info.display();
		Sword sword = info.details();
		sword.display();
	}
}