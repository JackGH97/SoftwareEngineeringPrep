package com.hawkins;

import java.util.ArrayList;
import java.util.Collections;

public class Table<T extends Team> {

    private final String leagueName;
    private ArrayList<Team> leagueTable = new ArrayList<>();;

    public Table(String leagueName) {
        this.leagueName = leagueName;
    }

    public String getLeagueName() {
        return this.leagueName;
    }

    public boolean addTeam(T team){
        if(leagueTable.contains(team)){
            System.out.println(team.getName()+ " Team already exists");
            return false;
        } else {
            leagueTable.add(team);
            System.out.println(team.getName()+ " Team added");
            return true;
        }
    }

    public int numTeams(){
        return this.leagueTable.size();
    }

    public void printTable(){
        Collections.sort(this.leagueTable);
        for(int i = 0; i < this.leagueTable.size(); i++){
            System.out.println(this.leagueTable.get(i).getName());
        }
    }


}
