package com.hawkins;

public class Printer {

    private int tonerLevels;
    private int pagesPrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevels, int pagesPrinted, boolean duplexPrinter) {
        this.tonerLevels = tonerLevels;
        if(this.tonerLevels < 0 || this.tonerLevels > 10 ){
            this.tonerLevels = 10;
        }
        this.pagesPrinted = pagesPrinted;
        this.duplexPrinter = duplexPrinter;
    }

    public void fillUpToner(int toner){
        if(this.tonerLevels == 10){
            System.out.println("Printer is full");
        }
        else if((this.tonerLevels +toner) > 10){
            this.tonerLevels = 10;
        }else {
            this.tonerLevels += toner;
        }
    }

    public int getTonerLevels() {
        return tonerLevels;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public void isDuplexPrinter() {
        if(this.duplexPrinter){
            System.out.println("Printer is Duplex");
        }else{
            System.out.println("Printer is not Duplex");
        }
    }

    public void increasePagesPrint(int pagesPrinted){
        this.pagesPrinted += pagesPrinted;
        System.out.println("total pages printed " + this.pagesPrinted );
    }

}
