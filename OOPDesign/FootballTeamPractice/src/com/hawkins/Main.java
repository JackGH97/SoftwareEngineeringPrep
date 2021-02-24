package com.hawkins;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Player jack = new Player("Jack Hawkins",23, StrongFoot.RIGHT,5, Position.LS);
        Player james = new Player("James Hawkins    ",27, StrongFoot.RIGHT,3, Position.RB);
        Player cameron = new Player("Cameron Jacques",28, StrongFoot.RIGHT,6, Position.RS);
        Player keys = new Player("Keys Rucklidge",27, StrongFoot.RIGHT,7, Position.LS);
        Player eamonn = new Player("Eamonn Corcron",28, StrongFoot.RIGHT,2, Position.LS);
        Player Ed = new Player("Ed Clarke",27, StrongFoot.RIGHT,4, Position.LS);
        Player Ben = new Player("Ben Corcron",27, StrongFoot.RIGHT,1, Position.LS);
        Player BenF = new Player("Ben French",30, StrongFoot.LEFT,8, Position.LS);

        ArrayList<Player> bagRaidersPlayers = (ArrayList<Player>) Arrays.asList(jack,james,cameron,keys,eamonn,Ed,Ben,BenF);

        Manager ollyP = new Manager("Olly Payne", 27, "Bag Raiders");
        Team bagRaiders = new Team("Bag Raiders",ollyP,bagRaidersPlayers);

        
    }
}
