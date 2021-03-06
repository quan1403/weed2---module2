package com.codegym;

public class Shape {
    public String color ="green";
    public boolean filled;

    public Shape (){

    }
    public Shape(String color,boolean filled){
        this.color =color;
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    @Override
    public String toString(){
        return "A Shape with color of" +getColor() + "and"+ (isFilled()?"filled":"not filled");
    }
}
