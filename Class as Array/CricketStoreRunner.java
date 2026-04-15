class CricketStoreRunner{
	
	public static void main(String[] args){
		
		Cricket[] crickets = new Cricket[20];
		
		crickets[0] = new Cricket("T20","RCB","Virat Kohli",11,"Chinnaswamy",true,20,"Andy Flower",2.5,"Red");
		crickets[1] = new Cricket("ODI","India","Rohit Sharma",11,"Wankhede",true,50,"Dravid",1.0,"Blue");
		crickets[2] = new Cricket("Test","Australia","Pat Cummins",11,"MCG",true,90,"McDonald",3.0,"Yellow");
		crickets[3] = new Cricket("T20","CSK","Dhoni",11,"Chepauk",true,20,"Fleming",2.0,"Yellow");
		crickets[4] = new Cricket("ODI","England","Buttler",11,"Lords",true,50,"Mott",4.0,"Blue");
		crickets[5] = new Cricket("T20","MI","Hardik Pandya",11,"Wankhede",true,20,"Boucher",3.5,"Blue");
		crickets[6] = new Cricket("Test","India","Rohit Sharma",11,"Eden Gardens",true,90,"Dravid",1.5,"White");
		crickets[7] = new Cricket("ODI","Pakistan","Babar Azam",11,"Gaddafi",true,50,"Grant",5.0,"Green");
		crickets[8] = new Cricket("T20","KKR","Shreyas Iyer",11,"Eden Gardens",true,20,"Chandrakant",4.5,"Purple");
		crickets[9] = new Cricket("Test","England","Root",11,"Lords",true,90,"McCullum",3.2,"White");
		crickets[10] = new Cricket("ODI","South Africa","Bavuma",11,"Centurion",true,50,"Boucher",6.0,"Green");
		crickets[11] = new Cricket("T20","SRH","Cummins",11,"Hyderabad",true,20,"Vettori",5.5,"Orange");
		crickets[12] = new Cricket("Test","New Zealand","Williamson",11,"Auckland",true,90,"Stead",4.8,"White");
		crickets[13] = new Cricket("ODI","Bangladesh","Shakib",11,"Dhaka",true,50,"Hathurusingha",7.0,"Green");
		crickets[14] = new Cricket("T20","DC","Pant",11,"Delhi",true,20,"Ponting",3.9,"Blue");
		crickets[15] = new Cricket("Test","Sri Lanka","Karunaratne",11,"Colombo",true,90,"Silverwood",6.5,"White");
		crickets[16] = new Cricket("ODI","Afghanistan","Shahidi",11,"Kabul",true,50,"Trott",8.0,"Blue");
		crickets[17] = new Cricket("T20","GT","Gill",11,"Ahmedabad",true,20,"Nehra",2.8,"Blue");
		crickets[18] = new Cricket("Test","West Indies","Brathwaite",11,"Barbados",true,90,"Sammy",7.5,"Maroon");
		crickets[19] = new Cricket("ODI","Zimbabwe","Ervine",11,"Harare",true,50,"Houghton",9.0,"Red");
		
		CricketStore store = new CricketStore();
		
		for(int i=0; i<crickets.length; i++){
			store.store(crickets[i]);
		}
		
		store.display();
	}
}