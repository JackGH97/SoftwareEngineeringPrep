package com.hawkins;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Team {

    private String name;
    private List<Player> players;
    private Manager manager;

    public Team(String name, Manager manager, ArrayList<Player> players) {
        this.name = name;
        this.players = players;
        this.manager = manager;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public boolean addPlayers(Player player){
        if(players.size() <= 8){
            if(!players.contains(player)){
               return players.add(player);
            }
        }
        return false;
    }

    public boolean removePlayer(Player player){
        if(players != null && players.contains(player)){
            return players.remove(player);
        }
        return false;
    }
}
