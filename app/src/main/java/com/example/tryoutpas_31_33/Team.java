package com.example.tryoutpas_31_33;

public class Team {
    private String strTeam;
    private String strStadium;
    private String strBadge;
    public Team() {}

    public Team(String strTeam, String strStadium, String strBadge) {
        this.strTeam = strTeam;
        this.strStadium = strStadium;
        this.strBadge = strBadge;
    }

    public String getStrTeam() {
        return strTeam;
    }

    public String getStrBadge(){
        return strBadge;
    }

    public String getStrStadium() {
        return strStadium;
    }
}
