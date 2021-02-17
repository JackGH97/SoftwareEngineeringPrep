package com.hawkins;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Printer printer = new Printer(5,20,true);
        printer.isDuplexPrinter();
        System.out.println(printer.getPagesPrinted());
        printer.fillUpToner(10);
        System.out.println(printer.getTonerLevels());
        printer.increasePagesPrint(20);
        System.out.println(printer.getPagesPrinted());
    }
}
