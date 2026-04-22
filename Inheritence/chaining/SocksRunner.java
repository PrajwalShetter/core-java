class SocksRunner{
	
	public static void main(String[] args){
		
		SportsSock socks1 = new SportsSock();
		SportsSock socks2 = new SportsSock();
		
		socks1.wear();
		socks1.remove();
		socks1.wash();
		socks1.dry();
		socks1.fold();
		System.out.println("--------------------");
		socks2.wear();
		socks2.remove();
		socks2.wash();
		socks2.dry();
		socks2.fold();
	}
}