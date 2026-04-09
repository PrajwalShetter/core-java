class MyFile{
	
	String fileName;
	FolderFileType type;
	double size;
	
	MyFile(String fileName, FolderFileType type, double size){
		
		this.fileName = fileName;
		this.type = type;
		this.size = size;
		
	}
	
	MyFile(){
		
	}
	
	public void display(){
		System.out.println("File Name : "+this.fileName);
		System.out.println("Type : "+this.type);
		System.out.println("Size : "+this.size);
	}
}