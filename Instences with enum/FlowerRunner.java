class FlowerRunner{
	public static void main(String... args){
		FlowerInfo info = new FlowerInfo("Lalbagh", "Winter");
		info.display();
		Flower flower = info.details();
		flower.display();
	}
}