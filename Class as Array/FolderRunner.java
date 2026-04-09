class FolderRunner{
	
	public static void main(String[] args){
		
		MyFile fileOne = new MyFile("Resume",FolderFileType.PDF,1.2);
		MyFile fileTwo = new MyFile("Photo",FolderFileType.IMAGE,2.5);
		
		MyFile files[] = {fileOne,null,fileTwo,null};
		
		Folder folder = new Folder("MyDocs",Classification.PRIVATE,"C:/Users",files);
		folder.display();
	}
}