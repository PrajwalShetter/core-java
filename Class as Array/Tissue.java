class Tissue{
	
	String type;
	String brand;
	String material;
	int ply;
	int sheetsCount;
	boolean scenteed;
	String fragrance;
	double price;
	String color;
	boolean biodegradable;	
	
	
	Tissue(String type,String brand, String material, int ply,int sheetsCount,boolean scenteed, String fragrance, double price, String color, boolean biodegradable){
		
		this.type=type;
		this.brand=brand;
		this.material=material;
		this.ply=ply;
		this.sheetsCount=sheetsCount;
		this.scenteed= scenteed;
		this.fragrance=fragrance;
		this.price=price;
		this.color=color;
		this.biodegradable=biodegradable;
	
	}
	
	void display(){
		
		System.out.println("=================");
		System.out.println("type :"+this.type);
		System.out.println("brand :"+this.brand);
		System.out.println("material :"+this.material);
		System.out.println("ply :"+this.ply);
		System.out.println("sheetsCount :"+this.sheetsCount);
		System.out.println("scenteed :"+this.scenteed);
		System.out.println("fragrance :"+this.fragrance);
		System.out.println("price :"+this.price);
		System.out.println("color :"+this.color);
		System.out.println("biodegradable :"+this.biodegradable);
		
		
	}
}