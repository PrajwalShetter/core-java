class Cricket{
	
	String format;
	String teamName;
	String captain;
	int    playersCount;
	String homeGround;
boolean    internationalMatch;
	int    overs;
	String coach;
	double teamRanking;
	String jerseyColor;
	
	Cricket(String format, String teamName, String captain, int playersCount, String homeGround, boolean internationalMatch, int overs, String coach, double teamRanking,String jerseyColor){
		
		this.format=format;
		this.teamName=teamName;
		this.captain=captain;
		this.playersCount=playersCount;
		this.homeGround=homeGround;
		this.internationalMatch=internationalMatch;
		this.overs=overs;
		this.coach=coach;
		this.teamRanking=teamRanking;
		this.jerseyColor=jerseyColor;
	
	}
	
	void display(){
		
		System.out.println("========================");
		System.out.println("format :"+this.format);
		System.out.println("teamName :"+this.teamName);
		System.out.println("captain :"+this.captain);
		System.out.println("playersCount :"+this.playersCount);
		System.out.println("homeGround :"+this.homeGround);
		System.out.println("internationalMatch :"+this.internationalMatch);
		System.out.println("overs :"+this.overs);
		System.out.println("coach :"+this.coach);
		System.out.println("teamRanking :"+this.teamRanking);
		System.out.println("jerseyColor :"+this.jerseyColor);
		
		
	}
}