package com.hawkins.Exercise2;

public class Rectangle {

    private double width;
    private double length;

    public Rectangle(){
        this.width = 0;
        this.length = 0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;

        if(this.width < 0){
            this.width = 0;
        }
        if(this.length <0){
            this.length =0;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea(){
        return (this.length * this.width);
    }

}
