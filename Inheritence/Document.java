class Document{
	 
	 String type;
	 boolean digital;
	 
	 Document(String type, boolean digital){
		 this.type = type;
		 this.digital = digital;
	 }
	 
	 void display(){
		System.out.println("type : " + this.type);
		System.out.println("digital : " + this.digital);
	}
 }
 
 