class paintRunner{
	
	public static void main(String[] args){
		
		OilPaint paint1 = new OilPaint();
		OilPaint paint2 = new OilPaint();
		
		paint1.apply();
		paint1.dry();
		paint1.mix();
		paint1.store();
		paint1.cleanBrush();
		
		System.out.println("----------------");
		
		paint2.apply();
		paint2.dry();
		paint2.mix();
		paint2.store();
		paint2.cleanBrush();
	}
}