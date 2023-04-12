package aut.isp.lab4.exercise5;

public abstract class Actuator {

    public String manufacturer;
    public String model;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String toString(){
        return "Model: " + getModel() + " Manufacturer: " + getManufacturer();
    }

    public void turnOff(){

    }

    public void turnOn(){

    }

}
