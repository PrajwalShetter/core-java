class LightHouse{
	
	String name;
	LightType type;
	double height;
	
	LightHouse(String name, LightType type, double height){
		
		this.name = name;
		this.type = type;
		this.height = height;
		
	}
	
	LightHouse(){
		
	}
	
	public void display(){
		System.out.println("Name : "+this.name);
		System.out.println("Type : "+this.type);
		System.out.println("Height : "+this.height);
	}
}