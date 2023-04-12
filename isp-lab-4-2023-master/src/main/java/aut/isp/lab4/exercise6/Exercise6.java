package aut.isp.lab4.exercise6;

public class Exercise6 {
    public static void main(String[] args) {
        FishFeeder f = new FishFeeder();
        f.setManufacturer("Fish Corp");
        f.setModel("Super Feeder");
        f.setMeals(5);

        Alarm alarm = new Alarm();

        AquariumController a = new AquariumController();
        a.setpHlevel(7);
        a.setManufacturer("Aquarium Corp");
        a.setModel("Standard Aquarium");
        a.setFeedingTime(10.0f);
        a.setFeeder(f);
        a.setCurrentTime(10.0f);
        a.toString();
        a.alarm = alarm;
        a.checkPH();
    }
}
