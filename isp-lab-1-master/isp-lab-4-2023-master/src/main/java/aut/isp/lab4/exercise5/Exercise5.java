package aut.isp.lab4.exercise5;

public class Exercise5 {
    public static void main(String[] args) {
        FishFeeder f = new FishFeeder();
        f.setManufacturer("Fish Corp");
        f.setModel("Super Feeder");
        f.setMeals(5);

        LevelSensor ls = new LevelSensor();
        TemperatureSensor ts = new TemperatureSensor();

        Alarm alarm = new Alarm();
        Heater heater = new Heater();

        ls.setValue(20.0f);
        ts.setValue(25);

        AquariumController a = new AquariumController();
        a.setLevel(25.0f);
        a.setManufacturer("Aquarium Corp");
        a.setModel("Standard Aquarium");
        a.setFeedingTime(10.0f);
        a.setFeeder(f);
        a.setCurrentTime(10.0f);
        a.toString();
        a.ls = ls;
        a.ts = ts;
        a.heater=heater;
        a.alarm = alarm;
        a.checkTemperature();
        a.checkWaterLevel();

    }
}
