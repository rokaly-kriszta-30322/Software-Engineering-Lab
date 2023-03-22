package isp.lab3.exercise2;

import isp.lab3.exercise1.Tree;

public class Rectangle {

    //attributes
    private int length=2;
    private int width=1;
    private String color="red";

    //constructors
    public Rectangle(){}
    public Rectangle(int width, int length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(int width, int length, String color){
        this.color = color;
        this.width = width;
        this.length = length;
    }

    //methods
    public int getLength(){
        return this.length;
    }
    public int getWidth(){
        return this.width;
    }
    public String getColor(){
        return this.color;
    }
    public int getPerimeter(){
        return this.length+this.width;
    }
    public int getArea(){
        return this.length*this.width;
    }

    //main method
    public static void main(String[] args){
        Rectangle r;
        Rectangle r2 = new Rectangle();

        System.out.println(r2.getColor());
        r = new Rectangle(12,34,"purple");
        r.getWidth();
        r.getLength();
        r.getPerimeter();
        r.getColor();
        r.getArea();
        System.out.println(r.getColor());
    }
}

