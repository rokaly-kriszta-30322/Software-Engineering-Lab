package aut.isp.lab4.exercise3;

public class AquariumController {

    private String manufacturer;
    private String model;
    private float currentTime;
    private float feedingTime;
    private FishFeeder feeder;

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

    public float getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(float currentTime) {
        this.currentTime = currentTime;
        if(currentTime == feedingTime){
            feeder.feed();
        }
    }

    public float getFeedingTime() {
        return feedingTime;
    }

    public void setFeedingTime(float feedingTime) {
        this.feedingTime = feedingTime;
    }

    public FishFeeder getFeeder() {
        return feeder;
    }

    public void setFeeder(FishFeeder feeder) {
        this.feeder = feeder;
    }

    public String toString(){
        return "Model: " + getModel() + " Manufacturer: " + getManufacturer() + " Current Time " + getCurrentTime();
    }

}
