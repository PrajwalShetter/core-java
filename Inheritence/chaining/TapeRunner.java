class TapeRunner{
	
	public static void main(String[] args){
		
		AdhesiveTape tape1 = new AdhesiveTape();
		AdhesiveTape tape2 = new AdhesiveTape();
		
		tape1.stick();
		tape1.remove();
		tape1.cut();
		tape1.roll();
		tape1.store();
		
		System.out.println("-------------");
		
		tape2.stick();
		tape2.remove();
		tape2.cut();
		tape2.roll();
		tape2.store();
	}
}