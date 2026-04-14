class CupRunner{
	
	public static void main(String[] args){
		
		Cup cup = new Cup();
		cup.save("Tea Cup");
		cup.save("Coffee Cup");
		cup.save("Glass Cup");
		cup.save("Steel Cup");
		cup.save("Paper Cup");
		
		cup.search("Coffee Cup");
		cup.search("Plastic Cup");
	}
}