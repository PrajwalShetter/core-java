class Collector{
	
	String name;
	int batchNo ;
	
	Collector(String name, int batchNo){
		this.name = name;
		this.batchNo = batchNo;
	}
	
	void display(){
		System.out.println("");
		System.out.println("name :"+this.name);
		System.out.println("batchNo :"+this.batchNo);
	}


}
