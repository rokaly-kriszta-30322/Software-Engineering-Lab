package aut.isp.lab4.exercise1;

public class AquariumController {

    //attributs

    private String manufacturer;
    private String model;
    private float currentTime;
    //constructors
    //methods

    public String toString(){
        return "Model: " + getModel() + " Manufacturer: " + getManufacturer() + " Current Time " + getCurrentTime();
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCurrentTime(float currentTime) {
        this.currentTime = currentTime;
    }

    public float getCurrentTime() {
        return currentTime;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }
}
