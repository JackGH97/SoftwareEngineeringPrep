package com.hawkins;

public class Main {

    public static void main(String[] args) {
	// write your code here
        FootballPlayer jack = new FootballPlayer("Jack");
        BaseballPlayer tim = new BaseballPlayer("Tim");
        SoccerPlayer dog = new SoccerPlayer("Dog");



        Team<FootballPlayer> ferring = new Team<>("Ferring FC");
        ferring.addPlayer(jack);

        Team<FootballPlayer> copthorne = new Team<>("Copthron FC");
        copthorne.addPlayer(jack);

        Team<BaseballPlayer> baseballPlayerTeam = new Team<>("Crap SPort FC");

        ferring.matchResult(copthorne,5,2);

        Table<Team<FootballPlayer>> premierLeague = new Table<>("Premier League");
        premierLeague.addTeam(ferring);
        premierLeague.addTeam(copthorne);
//        premierLeague.addTeam(baseballPlayerTeam);
        premierLeague.printTable();



    }
}
