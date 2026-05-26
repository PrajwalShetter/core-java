package com.prajwal.learnequlsmethod;

public class IplTeam {
    private String TeamName;
    private String leaderName;
    private int noOfPlayers;
    private int noOfMatchWin;
    private int NoOfCupWin;

    public IplTeam() {

    }

    public IplTeam(String teamName, String leaderName, int noOfPlayers, int noOfMatchWin, int noOfCupWin) {
        TeamName = teamName;
        this.leaderName = leaderName;
        this.noOfPlayers = noOfPlayers;
        this.noOfMatchWin = noOfMatchWin;
        NoOfCupWin = noOfCupWin;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            if(obj instanceof IplTeam){
                IplTeam iplTeam = (IplTeam) obj;
                if(this.TeamName.equals(iplTeam.TeamName) && this.leaderName.equals(iplTeam.leaderName)){
                    return true;
                }
            }
        }
        return false;
    }

    public String getTeamName() {
        return TeamName;
    }

    public void setTeamName(String teamName) {
        TeamName = teamName;
    }

    public String getLeaderName() {
        return leaderName;
    }

    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
    }

    public int getNoOfPlayers() {
        return noOfPlayers;
    }

    public void setNoOfPlayers(int noOfPlayers) {
        this.noOfPlayers = noOfPlayers;
    }

    public int getNoOfMatchWin() {
        return noOfMatchWin;
    }

    public void setNoOfMatchWin(int noOfMatchWin) {
        this.noOfMatchWin = noOfMatchWin;
    }

    public int getNoOfCupWin() {
        return NoOfCupWin;
    }

    public void setNoOfCupWin(int noOfCupWin) {
        NoOfCupWin = noOfCupWin;
    }
}
