class ClassroomRunner{
	
	public static void main(String[] args){
		
		Duster dusterOne = new Duster("Classmate",DusterType.SMALL,30);
		Duster dusterTwo = new Duster("Camlin",DusterType.LARGE,60);
		
		Duster dusters[] = {dusterOne,null,dusterTwo,null};
		
		Classroom classroom = new Classroom("C101",2,dusters);
		classroom.display();
	}
}