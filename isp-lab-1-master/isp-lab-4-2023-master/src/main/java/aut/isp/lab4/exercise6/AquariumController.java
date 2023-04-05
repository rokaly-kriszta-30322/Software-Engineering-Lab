package aut.isp.lab4.exercise6;

public class AquariumController {

    private String manufacturer;
    private String model;
    private float currentTime;
    private float feedingTime;
    private FishFeeder feeder;
    private float pHlevel;
    public Sensor sensor;
    public Actuator actuator;
    public Alarm alarm;

    public void setAlarm(Alarm alarm) {
        this.alarm = alarm;
    }

    public Alarm getAlarm() {
        return alarm;
    }

    public float getpHlevel() {
        return pHlevel;
    }

    public void setpHlevel(float pHlevel) {
        this.pHlevel = pHlevel;
    }

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

    public void checkPH(){
        if (getpHlevel()>7 || getpHlevel()<7){
            alarm.turnOn();
            System.out.println("PH LEVEL OUT OF CONTROL");
        }
        if (getpHlevel() == 7){
            alarm.turnOff();
            System.out.println("pH level is ideal");
        }

    }
}
