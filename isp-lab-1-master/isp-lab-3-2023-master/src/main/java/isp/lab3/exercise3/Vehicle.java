package isp.lab3.exercise3;

import isp.lab3.exercise2.Rectangle;

public class Vehicle {

    //attributes
    private String model;
    private String type;
    private int speed;
    private char fuelType;

    static int k;
    //constructors
    public Vehicle(String model, String type, int speed, char fuelType){
        this.model = model;
        this.type = type;
        this.speed = speed;
        this.fuelType=fuelType;
        k++;
    }

    //methods
    public String getModel(){
        return this.model;
    }
    public String getType(){
        return this.type;
    }
    public int getSpeed(){
        return this.speed;
    }
    public char getFuelType(){
        return this.fuelType;
    }
    public void setModel(String model){
        this.model=model;
    }
    public void setType(String type){
        this.type=type;
    }
    public void setSpeed(int speed){
        this.speed=speed;
    }
    public void setFuelType(char fuelType){
        this.fuelType=fuelType;
        if (this.fuelType != 'D' | this.fuelType !='B'){
            this.fuelType = 'D';
        }
    }
    public String toString(){
        return getModel() + " (" + getType() + ") speed " + getSpeed() + " fuel Type " + getFuelType();
    }

    public static void countMethod(){
        System.out.println(k);;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }

    //main method
    public static void main(String[] args){
        Vehicle v;
        Vehicle v2;
        v = new Vehicle("Dacia", "Logan", 150, 'B');
        v2 = new Vehicle("Dacia", "Logan", 150, 'B');
        v.setModel("Dacia");
        v.setType("Logan");
        v.setSpeed(150);
        v.setFuelType('B');
        v2.setModel("Dacia");
        v2.setType("Logan");
        v2.setSpeed(150);
        v2.setFuelType('B');
        //v2.setModel("Opel");
        //v2.setType("Astra");
        //v2.setSpeed(300);
        //v2.setFuelType('D');
        System.out.println(v.toString());
        System.out.println(v2.toString());
        if (v.equals(v2))
            System.out.println("equal");

        Vehicle.countMethod();
    }

}
