class IpodRunner{
	
	public static void main(String[] args){
		
		SmartIpod ipod1 = new SmartIpod();
		SmartIpod ipod2 = new SmartIpod();
		
		ipod1.play();
		ipod1.pause();
		ipod1.stop();
		ipod1.charge();
		ipod1.connect();
		
		System.out.println("-------------");
		
		ipod2.play();
		ipod2.pause();
		ipod2.stop();
		ipod2.charge();
		ipod2.connect();
	}
}