package aut.isp.lab4.exercise4;

public class Exercise4 {
    public static void main(String[] args) {

            FishFeeder f = new FishFeeder();
            f.setManufacturer("Fish Corp");
            f.setModel("Super Feeder");
            f.setMeals(5);

            AquariumController a = new AquariumController();
            a.setManufacturer("Aquarium Corp");
            a.setModel("Standard Aquarium");
            a.setFeedingTime(10.0f);
            a.setFeeder(f);
            a.setLightOffTime(1.0f);
            a.setCurrentTime(10.0f);
            a.setCurrentTime(18.1f);
            a.setCurrentTime(20.0f);
            a.setCurrentTime(4.0f);
            a.setCurrentTime(11.0f);
            a.setCurrentTime(21.0f);
    }
}
