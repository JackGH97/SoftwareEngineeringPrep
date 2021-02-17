package com.hawkins;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>>{

    private String name;
    int played = 0;
    int won = 0;
    int tied = 0;
    int lost = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println(player.getName()+ " Player already exists");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName()+ " Player added");
            return true;
        }
    }

    public int numPlayers(){
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore){
        String message;
        if(ourScore > theirScore){
            message = " Beat ";
            won++;
        } else if (ourScore == theirScore){
            message = " Drew with ";
            tied++;
        }
        else{
            message = " lost to ";
            lost++;
        }
        played++;
        if(opponent!=null){
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null,theirScore,ourScore);
        }
    }

    public int ranking(){
        return (won*2) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        return Integer.compare(team.ranking(), this.ranking());
    }
}
