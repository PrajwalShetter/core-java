class Thread{
	String material;
	int length;
	
	Thread(String material, int length){
		this.material = material;
		this.length = length;
	}
	
	void display(){
		System.out.println("material : " + this.material);
		System.out.println("length : " + this.length);
	}
}
