package com.JackHawkins;

public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    public SimpleCalculator(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public SimpleCalculator(double firstNumber) {
        this(firstNumber,2);
        this.firstNumber = firstNumber;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNUmber(double secondNUmber) {
        this.secondNumber = secondNUmber;
    }

    public double getAdditionResult(){
        return this.firstNumber + this.secondNumber;
    }

    public double getSubtractionResult(){
        return this.firstNumber - this.secondNumber;
    }

    public double getMultiplicationResult(){
        return this.firstNumber * this.secondNumber;
    }

    public double getDivisionResult(){
        if(this.secondNumber != 0){
            return this.firstNumber/this.secondNumber;
        }
        return 0;
    }


}
