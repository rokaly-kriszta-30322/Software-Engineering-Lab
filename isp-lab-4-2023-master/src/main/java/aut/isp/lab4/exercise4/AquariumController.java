package aut.isp.lab4.exercise4;

public class AquariumController {

    private float lightOnTime;
    private float lightOffTime;
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

    public float getLightOffTime() {
        return lightOffTime;
    }

    public float getLightOnTime() {
        return lightOnTime;
    }

    public void setLightOffTime(float lightOffTime) {
        this.lightOffTime = lightOffTime;
        System.out.println("Light Off at" + currentTime);
    }

    public void setLightOnTime(float lightOnTime) {
        this.lightOnTime = lightOnTime;
        System.out.println("Light On at" + currentTime);
    }

    public void setCurrentTime(float currentTime) {
        this.currentTime = currentTime;
        if(currentTime == feedingTime){
            feeder.feed();
        }
        if (((currentTime - lightOnTime) >= 6 || (lightOnTime - currentTime) >= 8) && lightOnTime != 0) {
            setLightOffTime(currentTime);
            lightOnTime = 0;
        }
        if (((currentTime - lightOffTime) >= 16 || (lightOffTime - currentTime) >= 16) && lightOffTime != 0) {
            setLightOnTime(currentTime);
            lightOffTime = 0;
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
