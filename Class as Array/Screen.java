class Screen{
	
	String type;
	String brand;
	double size;
	String resolution;
	boolean touchScreen;
	int refreshRate;
	String panelType;
	double price;
	boolean curved;
	String color;
	
	Screen(String type, String brand, double size, String resolution, boolean touchScreen, int refreshRate, String panelType, double price,
				boolean curved, String color){
					
				this.type=type;
				this.brand=brand;
				this.size=size;
				this.resolution=resolution;
				this.touchScreen=touchScreen;
				this.refreshRate=refreshRate;
				this.panelType=panelType;
				this.price=price;
				this.curved=curved;
				this.color=color;
				}
				
				void display(){
					System.out.println("===================");
					System.out.println("type :"+this.type);
					System.out.println("brand :"+this.brand);
					System.out.println("size :"+this.size);
					System.out.println("resolution :"+this.resolution);
					System.out.println("touchScreen :"+this.touchScreen);
					System.out.println("refreshRate :"+this.refreshRate);
					System.out.println("panelType :"+this.panelType);
					System.out.println("price :"+this.price);
					System.out.println("curved :"+this.curved);
					System.out.println("color :"+this.color);

				}
}