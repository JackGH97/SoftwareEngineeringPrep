package com.JackHawkins;

public class Wall {

    private double width;
    private double height;

    public Wall() {
    }

    public Wall(double width, double height) {
        if(width == 0){
            this.width = 0;
        } else if(height == 0){
            this.height = 0;
        } else {
            this.width = width;
            this.height = height;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        if(this.height == 0 || this.width == 0){
            return 0;
        }
        return this.width * this.height;
    }
}
