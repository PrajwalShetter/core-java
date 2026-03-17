class TissuePaperRunner
{
	public static void main(String[] args){
		
		double price = TissuePaper.getPriceByThickness(0.5f);
		System.out.println(price);
		
		price = TissuePaper.getPriceByThickness(0.7f);
		System.out.println(price);
		
		price = TissuePaper.getPriceByThickness(1.0f);
		System.out.println(price);
		
		price = TissuePaper.getPriceByThickness(1.2f);
		System.out.println(price);
		
		price = TissuePaper.getPriceByThickness(1.5f);
		System.out.println(price);
		
		float thick = 0.5f;
		price = TissuePaper.getPriceByThickness(thick);
		System.out.println(price);
		
		 thick = 0.7f;
		price = TissuePaper.getPriceByThickness(thick);
		System.out.println(price);
		
		 thick = 1.0f;
		price = TissuePaper.getPriceByThickness(thick);
		System.out.println(price);
		
		 thick = 1.2f;
		price = TissuePaper.getPriceByThickness(thick);
		System.out.println(price);
		
		 thick = 1.5f;
		price = TissuePaper.getPriceByThickness(thick);
		System.out.println(price);
		
	}
}