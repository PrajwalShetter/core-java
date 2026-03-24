class CountryRunner{

	public static void main(String[] args){

		String name="india";
		String president=CountryPresident.getPresident(name);

		if(president!=null){
			System.out.println("President is :"+president);
		}

		name="usa";
		president=CountryPresident.getPresident(name);

		if(president!=null){
			System.out.println("President is :"+president);
		}

		name="france";
		president=CountryPresident.getPresident(name);

		if(president!=null){
			System.out.println("President is :"+president);
		}
	}
}