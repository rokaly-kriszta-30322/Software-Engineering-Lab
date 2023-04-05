package aut.isp.lab4.exercise3;

public class Exercise3 {
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
        a.setCurrentTime(10.0f);

    }
}
