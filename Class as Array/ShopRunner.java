class ShopRunner{
	
	public static void main(String[] args){
		
		NailCutter nailCutterOne = new NailCutter("Veet",CutterType.SMALL,50);
		NailCutter nailCutterTwo = new NailCutter("Philips",CutterType.LARGE,120);
		
		NailCutter nailCutters[] = {nailCutterOne,null,nailCutterTwo,null};
		
		Shop shop = new Shop("Beauty Store","Bangalore",nailCutters);
		shop.display();
	}
}