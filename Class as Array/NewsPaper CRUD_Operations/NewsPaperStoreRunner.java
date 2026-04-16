class NewsPaperStoreRunner{
	
	public static void main(String[] args){
		
		NewsPaperStore store = new NewsPaperStore();
		
		NewsPaper newspaper1 = new NewsPaper(Lang.KANNADA, "udayVani","smooth",6.0,8,3.00,100.00,"Good Morning","turn over the page",12,30,"Prakash","Bangalore", InkColor.BLUE, 70);
		
		NewsPaper newspaper2 = new NewsPaper(Lang.ENGLISH, "Times of India","medium",9.0,12,4.00,120.00,"Good Morning","turn over the page",17,36,"Raju","Mumbai", InkColor.BLACK, 130);
		
		NewsPaper newspaper3 = new NewsPaper(Lang.TAMIL, "Sampark","smooth",7.0,10,4.00,70.00,"Good Morning","turn over the page",15,20,"Vijay","Chennai", InkColor.RED, 40);
		
		NewsPaper newspaper4 = new NewsPaper(Lang.HINDI, "Samachar","hard",9.0,10,5.00,150.00,"Good Morning","turn over the page",18,55,"Govind","Delhi", InkColor.GREEN, 90);

		NewsPaper newspaper5 = new NewsPaper(Lang.HINDI, "din suddi","smooth",9.0,10,5.00,120.00,"Good Morning","turn over the page",18,55,"Govind","gujarat", InkColor.BLACK, 20);
		
		store.save(newspaper1);
		
		System.out.println("");
		NewsPaper[] papers = {newspaper2,newspaper3, newspaper4};
		store.saveAll(papers);
		
		System.out.println("");
		store.findByName("udayVani");
		
		System.out.println("");
		store.display();
		
		System.out.println("");
		store.findPaperQualityByName("udayVani");
		
		System.out.println("");
		store.findPaperQualityByName("prajavani");
		
		System.out.println("");
		store.findPaperQualityByName(null);
		
		System.out.println("");
		store.findNoOfPagesByNameAndHeadEditor("Times of India","Raju");
		
		System.out.println("");
		store.findNoOfPagesByNameAndHeadEditor("null","Raju");
		
		System.out.println("");
		store.findNoOfPagesByNameAndHeadEditor("Times of India",null);
		
		System.out.println("");
		store.findNoOfPagesByNameAndHeadEditor("udayVani","Raju");
		
		System.out.println("");
		store.findNoOfPagesByNameAndHeadEditor(null ,null);
		
		System.out.println("");
		store.updateLangByName("udayVani",Lang.TELEUGU);
		
		System.out.println("");
		store.updateLangByName(null,Lang.TELEUGU);
		
		System.out.println("");
		store.updateInkColorAndNoOfImagesAndFontSizeByNameAndHeightAndWeight (InkColor.BLACK,12,19.00,"Sampark",4.00,70.00);
		
		System.out.println("");
		store.updateInkColorAndNoOfImagesAndFontSizeByNameAndHeightAndWeight (InkColor.BLACK,12,19.00,null,4.00,70.00);
		
		System.out.println("");
		store.updateInkColorAndNoOfImagesAndFontSizeByNameAndHeightAndWeight (InkColor.BLACK,12,19.00,"udayVani",4.00,70.00);
		
		System.out.println("");
		store.replaceByPrintHouseAddress("Delhi",newspaper5);
		
		System.out.println("");
		store.replaceByPrintHouseAddress(null,newspaper5);
	}
}