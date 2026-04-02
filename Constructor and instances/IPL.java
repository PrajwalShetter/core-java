class IPL {

    String teamName;
    String captain;
    int trophies;
    String homeGround;
    boolean hasStarPlayer;
    long teamId;
    String coach;
    int totalPlayers;
    double netRunRate;
    boolean qualified;

    
    IPL(String teamName, String captain, int trophies, String homeGround,
        boolean hasStarPlayer, long teamId, String coach,
        int totalPlayers, double netRunRate, boolean qualified) {

        this.teamName = teamName;
        this.captain = captain;
        this.trophies = trophies;
        this.homeGround = homeGround;
        this.hasStarPlayer = hasStarPlayer;
        this.teamId = teamId;
        this.coach = coach;
        this.totalPlayers = totalPlayers;
        this.netRunRate = netRunRate;
        this.qualified = qualified;
    }
}