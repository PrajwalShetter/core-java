class Folder{
	 
	String name;
	Classification classification;
	String path;
	MyFile[] file;
	 
	Folder(String name, Classification classification, String path, MyFile[] file){
		 
		this.name = name;
		this.classification = classification;
		this.path = path;
		this.file = file;
		 
	}
	 
	void display(){
		 
		System.out.println("Name :"+this.name);
		System.out.println("Classification :"+this.classification);
		System.out.println("Path :"+this.path);
		System.out.println("File details :");
		
		if(this.file != null){
			
			for(MyFile file : this.file){
				
				if(file != null){
					file.display();
				}
			}
		}
	}
}