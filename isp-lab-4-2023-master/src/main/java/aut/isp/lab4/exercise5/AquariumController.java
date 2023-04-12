package aut.isp.lab4.exercise5;

public class AquariumController {

    private String manufacturer;
    private String model;
    private float currentTime;
    private float feedingTime;
    private FishFeeder feeder;
    private int temperature;
    private float level;
    public Sensor sensor;
    public Actuator actuator;
    public LevelSensor ls;
    public TemperatureSensor ts;
    public Alarm alarm;
    public Heater heater;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public float getLevel() {
        return level;
    }

    public void setLevel(float level) {
        this.level = level;
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
    public void checkTemperature(){

        if (ts.getValue() <= 24){
            heater.turnOn();
            System.out.println("Heater turned on");
        }

        if (ts.getValue() < 27 && ts.getValue() > 24){
            System.out.println("Temperature is ideal");
        }

        if (ts.getValue() >= 27){
            heater.turnOff();
            System.out.println("Heater turned off");
        }

    }
    public void checkWaterLevel(){

        if(level < ls.getValue()){
            alarm.turnOn();
            System.out.println("Alarm turned on");
        }
        if(level >= ls.getValue()){
            alarm.turnOff();
            System.out.println("Alarm turned off");
        }

    }

}
