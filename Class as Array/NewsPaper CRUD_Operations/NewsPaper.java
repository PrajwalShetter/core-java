/*
NewsPaper: lang:enum,paperQuality,price,noOfPages,name,height,weight,headerText,footerText,fontSize,noOfImages,headEditor,
printHouseAddress, inkColor:enum,noOfContents 

NewsPaperStore:NewsPaper[100] 
save(NewsPaper newsPaper); 
saveAll(NewsPaper[] newsPapers);//10 
findByName(String name);
displayAll();
String findPaperQualityByName(String name);
int findNoOfPagesByNameAndHeadEditor(String name,String headEditor)
updateLangByName(String name,Lang newLang)
updateInkColorAndNoOfImagesAndFontSizeByNameAndHeightAndWeight (InkColor inkColor,int noOfImages,int fontSize,String name,double height,double weight)
replaceByPrintHouseAddress(String printHouseAddress,NewsPaper newsPaper)
*/

class NewsPaper{
	
	Lang lang;
	String name;
	String paperQuality;
	double price;
	int noOfPages;
	double height;
	double weight;
	String headerText;
	String footerText;
	double fontSize;
	int noOfImages;
	String headEditor;
	String printHouseAddress;
	InkColor inkColor;
	int noOfContents;
	
	NewsPaper(Lang lang, String name,String paperQuality, double price, int noOfPages, double height, double weight,String headerText,
					String footerText,double fontSize, int noOfImages, String headEditor, String printHouseAddress, InkColor inkColor,
					int noOfContents){
						
						this.lang = lang;
						this.name = name;
						this.paperQuality = paperQuality;
						this.price = price;
						this.noOfPages = noOfPages;
						this.height = height;
						this.weight = weight;
						this.headerText = headerText;
						this.footerText = footerText;
						this.fontSize = fontSize;
						this.noOfImages = noOfImages;
						this.headEditor = headEditor;
						this.printHouseAddress = printHouseAddress;
						this.inkColor = inkColor;
						this.noOfContents = noOfContents;

					}
					
					
	void display(){
		
		System.out.println("++++++++++++++++++++++++");
		System.out.println("language :"+this.lang);
		System.out.println("name :"+this.name);
		System.out.println("paperQuality :"+this.paperQuality);
		System.out.println("price :"+this.price);
		System.out.println("noOfPages :"+this.noOfPages);
		System.out.println("height :"+this.height);
		System.out.println("weight :"+this.weight);
		System.out.println("headerText :"+this.headerText);
		System.out.println("footerText :"+this.footerText);
		System.out.println("fontSize :"+this.fontSize);
		System.out.println("noOfImages :"+this.noOfImages);
		System.out.println("headEditor :"+this.headEditor);
		System.out.println("printHouseAddress :"+this.printHouseAddress);
		System.out.println("inkColor :"+this.inkColor);
		System.out.println("noOfContents :"+this.noOfContents);
		
	}
}