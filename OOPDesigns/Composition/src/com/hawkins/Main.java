package com.hawkins;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Case theCase = new Case("22b","Dell","240", new Dimensions(20,20,5));
        Monitor monitor = new Monitor("Beast","Dell",27,new Resolution(20,20));
        MotherBoard motherBoard = new MotherBoard("BigBoy", "Acer",4,2,"Windows");
        PC thePC = new PC (theCase,monitor,motherBoard);

        System.out.println(thePC.getMotherBoard().getCardSlots());
        thePC.getTheCase().pressPowerButton();

    }
}
