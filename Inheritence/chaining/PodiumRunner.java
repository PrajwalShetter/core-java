class PodiumRunner{
	
	public static void main(String[] args){
		
		DigitalPodium p1 = new DigitalPodium();
		DigitalPodium p2 = new DigitalPodium();
		
		p1.speak();
		p1.adjustHeight();
		p1.clean();
		p1.place();
		p1.remove();
		
		System.out.println("-------------");
		
		p2.speak();
		p2.adjustHeight();
		p2.clean();
		p2.place();
		p2.remove();
	}
}